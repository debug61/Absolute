package com.debug61.absolute.common.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;

public class LighterItem extends FlintAndSteelItem {

    public LighterItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType interactLivingEntity(ItemStack stack, PlayerEntity player, LivingEntity target, Hand hand) {
        if (!target.level.isClientSide && target.isAlive()) {
            if (!target.fireImmune() && !target.isInWater()) {
                target.setSecondsOnFire(5);
                target.hurt(DamageSource.LAVA, 4.0F);
            }
            stack.hurtAndBreak(1, target, (player1) -> player1.broadcastBreakEvent(hand));

            return ActionResultType.SUCCESS;
        } else {
            return ActionResultType.PASS;
        }
    }
}
