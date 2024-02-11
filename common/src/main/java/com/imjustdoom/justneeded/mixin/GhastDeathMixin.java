package com.imjustdoom.justneeded.mixin;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class GhastDeathMixin {

    @Inject(at = @At("HEAD"), method = "die")
    public void onDeath(DamageSource source, CallbackInfo ci) {
        if (!(((LivingEntity) (Object) this) instanceof Ghast) || !(source.getEntity() instanceof Piglin) || !(source.getDirectEntity() instanceof Arrow)) return;

        Ghast ghast = (Ghast) (Object) this;
        Level world = source.getEntity().level();
        ItemEntity item = new ItemEntity(world, ghast.getX(), ghast.getY(), ghast.getZ(), new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1));

        world.addFreshEntity(item);
    }
}