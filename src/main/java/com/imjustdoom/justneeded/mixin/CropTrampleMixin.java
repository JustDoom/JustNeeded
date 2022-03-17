package com.imjustdoom.justneeded.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FarmlandBlock.class)
public abstract class CropTrampleMixin extends Block {

	public CropTrampleMixin(Settings settings) {
		super(settings);
	}

	@Inject(at = @At("HEAD"), method = "onLandedUpon", cancellable = true)
	public void onLandUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance, CallbackInfo ci) {

		if(entity.isPlayer() && ((PlayerEntity) entity).getAbilities().creativeMode) {
			ci.cancel();
			return;
		}

		for (ItemStack itemStack : entity.getArmorItems()) {
			if (!(itemStack.getItem() instanceof ArmorItem armorItem)
					|| armorItem.getSlotType() != EquipmentSlot.FEET
					|| EnchantmentHelper.getLevel(Enchantments.FEATHER_FALLING, itemStack) == 0) continue;

			super.onLandedUpon(world, state, pos, entity, fallDistance);
			ci.cancel();
		}
	}
}
