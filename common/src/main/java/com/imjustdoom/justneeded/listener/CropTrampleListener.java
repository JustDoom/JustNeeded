package com.imjustdoom.justneeded.listener;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FarmBlock.class)
public abstract class CropTrampleListener extends Block {

    public CropTrampleListener(Properties properties) {
        super(properties);
    }

    @Inject(at = @At("HEAD"), method = "fallOn", cancellable = true)
    public void onLandUpon(Level world, BlockState state, BlockPos pos, Entity entity, float fallDistance, CallbackInfo ci) {

        if(entity instanceof Player && ((Player) entity).isCreative()) {
            ci.cancel();
            return;
        }

        for (ItemStack itemStack : entity.getArmorSlots()) {
            if (!(itemStack.getItem() instanceof ArmorItem armorItem)
                    || armorItem.getEquipmentSlot() != EquipmentSlot.FEET
                    || EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FALL_PROTECTION, itemStack) == 0) continue;

            super.fallOn(world, state, pos, entity, fallDistance);
            ci.cancel();
        }
    }
}
