/*package com.debug61.absolute.common.blockentity;

import com.debug61.absolute.common.tileentity.GeneratorTileEntity;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public abstract class AbstractGenerator extends Block {
    public static final DirectionProperty FACING;

    public AbstractGenerator() {
        super(Properties.of(Material.METAL).harvestLevel(2).strength(8.0f)
                .requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public ActionResultType use(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand) {
        if (level.isClientSide) {
            return ActionResultType.SUCCESS;
        } else {
            this.openContainer(level, pos, player);
            return ActionResultType.CONSUME;
        }
    }

    public abstract void openContainer(World level, BlockPos pos, PlayerEntity player);

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @SuppressWarnings("deprecated")
    @Override
    public BlockRenderType getRenderShape(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public void onRemove(BlockState state, World level, BlockPos pos, BlockState newState, boolean hasItems) {
        if(!state.is(newState.getBlock())) {
            TileEntity tileEntity = level.getBlockEntity(pos);
            if(tileEntity instanceof GeneratorTileEntity) {
                InventoryHelper.dropContents(level, pos, (IInventory) tileEntity);
                level.updateNeighbourForOutputSignal(pos, this);
            }
        }

        super.onRemove(state, level, pos, newState, hasItems);
    }

    static {
        FACING = HorizontalBlock.FACING;
    }
}*/
