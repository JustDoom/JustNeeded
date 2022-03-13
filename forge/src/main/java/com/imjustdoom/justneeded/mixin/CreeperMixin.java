//package com.imjustdoom.justneeded.mixin;
//
//import net.minecraft.nbt.CompoundTag;
//import net.minecraft.world.DifficultyInstance;
//import net.minecraft.world.entity.*;
//import net.minecraft.world.entity.ai.attributes.Attributes;
//import net.minecraft.world.entity.ai.goal.GoalSelector;
//import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
//import net.minecraft.world.entity.ai.goal.WrappedGoal;
//import net.minecraft.world.entity.monster.Creeper;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.ServerLevelAccessor;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//
//import javax.annotation.Nullable;
//import java.util.Set;
//
//@Mixin(Mob.class)
//public abstract class CreeperMixin extends LivingEntity {
//
//    protected CreeperMixin(EntityType<? extends LivingEntity> entityType, Level level) {
//        super(entityType, level);
//    }
//
//    @Inject(at = @At("HEAD"), method = "finalizeSpawn")
//    private void onInitialize(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType spawnReason, @Nullable SpawnGroupData entityData, @Nullable CompoundTag entityTag, CallbackInfoReturnable info){
//        if(getType() == EntityType.CREEPER){
//            Object object = this;
//            Creeper centity = ((Creeper)object);
//
//            GoalSelector targets = ((MobEntityAccessor) centity).getTargetSelector();
//
//            GoalSelector goals = ((MobEntityAccessor) centity).getGoalSelector();
//            Set<WrappedGoal> gGoals = ((GoalSelectorAccessor) goals).getGoals();
//
//            goals.removeGoal(((WrappedGoal) gGoals.toArray()[1]).getGoal()); // removing ignite goal (second goal added -> second goal in the array)
//            goals.addGoal(2, new BreachCreeperIgniteGoal(centity)); // adding the new Ignite Goal
//        }
//    }
//}
