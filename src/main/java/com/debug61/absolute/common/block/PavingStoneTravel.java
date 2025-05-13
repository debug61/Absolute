package com.debug61.absolute.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PavingStoneTravel extends Block {
    public PavingStoneTravel(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public void stepOn(World level, BlockPos pos, Entity entity) {
        BlockState state = level.getBlockState(pos);
        LivingEntity livingEntity = (LivingEntity) entity;
        if (!level.isClientSide) {
            livingEntity.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 40, 1, false, false));
        }
        super.stepOn(level, pos, entity);
    }
}
