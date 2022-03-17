package com.imjustdoom.justneeded.mixin;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class GhastDeathMixin {

	@Inject(at = @At("HEAD"), method = "onDeath")
	public void onDeath(DamageSource source, CallbackInfo ci) {
		if (!(((LivingEntity)(Object)this) instanceof GhastEntity)
				|| !(source.getAttacker() instanceof PiglinEntity)
				|| !(source.getSource() instanceof ArrowEntity)) {
			return;
		}

		World world = source.getAttacker().world;
		ItemEntity item = new ItemEntity(world,
				source.getAttacker().getX(),
				source.getAttacker().getY(),
				source.getAttacker().getZ(),
				new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1));
		world.spawnEntity(item);
	}
}
