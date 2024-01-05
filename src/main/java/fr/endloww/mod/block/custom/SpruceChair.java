package fr.endloww.mod.block.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.stream.Stream;


public class SpruceChair extends HorizontalDirectionalBlock {
    public SpruceChair(Properties p_54120_) {
        super(p_54120_);
    }

    public static final VoxelShape SHAPE_N = Stream.of(
            Block.box(2, 0, 2, 3, 10, 3),
            Block.box(2, 0.2, 2, 3, 0.3000000000000001, 3),
            Block.box(2, 0.2, 13, 3, 0.3, 14),
            Block.box(13, 0.2, 2, 14, 0.3000000000000001, 3),
            Block.box(13, 0.2, 13, 14, 0.3, 14),
            Block.box(2, 10, 2, 14, 11, 14),
            Block.box(3, 11, 3, 13, 11.5, 13),
            Block.box(4, 11.5, 8.5, 7.5, 12, 12),
            Block.box(1.75, 11.2, 12.75, 3.25, 11.7, 14.25),
            Block.box(12.75, 11.2, 12.75, 14.25, 11.7, 14.25),
            Block.box(8.5, 11.5, 8.5, 12, 12, 12),
            Block.box(8.5, 11.5, 4, 12, 12, 7.5),
            Block.box(4, 11.5, 4, 7.5, 12, 7.5),
            Block.box(1, 26, 13, 15, 28, 14),
            Block.box(2, 28, 13, 14, 29, 14),
            Block.box(2, 28, 13, 14, 29, 14),
            Block.box(3, 14, 13, 13, 15, 14),
            Block.box(2, 11, 13, 3, 26, 14),
            Block.box(6, 15, 13, 7, 26, 14),
            Block.box(9, 15, 13, 10, 26, 14),
            Block.box(13, 11, 13, 14, 26, 14),
            Block.box(13, 0, 2, 14, 10, 3),
            Block.box(2, 0, 13, 3, 10, 14),
            Block.box(13, 0, 13, 14, 10, 14)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            Block.box(2, 0, 13, 3, 10, 14),
            Block.box(2, 0.2, 13, 3, 0.3000000000000001, 14),
            Block.box(13, 0.2, 13, 14, 0.3, 14),
            Block.box(2, 0.2, 2, 3, 0.3000000000000001, 3),
            Block.box(13, 0.2, 2, 14, 0.3, 3),
            Block.box(2, 10, 2, 14, 11, 14),
            Block.box(3, 11, 3, 13, 11.5, 13),
            Block.box(8.5, 11.5, 8.5, 12, 12, 12),
            Block.box(12.75, 11.2, 12.75, 14.25, 11.7, 14.25),
            Block.box(12.75, 11.2, 1.75, 14.25, 11.7, 3.25),
            Block.box(8.5, 11.5, 4, 12, 12, 7.5),
            Block.box(4, 11.5, 4, 7.5, 12, 7.5),
            Block.box(4, 11.5, 8.5, 7.5, 12, 12),
            Block.box(13, 26, 1, 14, 28, 15),
            Block.box(13, 28, 2, 14, 29, 14),
            Block.box(13, 28, 2, 14, 29, 14),
            Block.box(13, 14, 3, 14, 15, 13),
            Block.box(13, 11, 13, 14, 26, 14),
            Block.box(13, 15, 9, 14, 26, 10),
            Block.box(13, 15, 6, 14, 26, 7),
            Block.box(13, 11, 2, 14, 26, 3),
            Block.box(2, 0, 2, 3, 10, 3),
            Block.box(13, 0, 13, 14, 10, 14),
            Block.box(13, 0, 2, 14, 10, 3)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.box(13, 0, 13, 14, 10, 14),
            Block.box(13, 0.2, 13, 14, 0.3000000000000001, 14),
            Block.box(13, 0.2, 2, 14, 0.3, 3),
            Block.box(2, 0.2, 13, 3, 0.3000000000000001, 14),
            Block.box(2, 0.2, 2, 3, 0.3, 3),
            Block.box(2, 10, 2, 14, 11, 14),
            Block.box(3, 11, 3, 13, 11.5, 13),
            Block.box(8.5, 11.5, 4, 12, 12, 7.5),
            Block.box(12.75, 11.2, 1.75, 14.25, 11.7, 3.25),
            Block.box(1.75, 11.2, 1.75, 3.25, 11.7, 3.25),
            Block.box(4, 11.5, 4, 7.5, 12, 7.5),
            Block.box(4, 11.5, 8.5, 7.5, 12, 12),
            Block.box(8.5, 11.5, 8.5, 12, 12, 12),
            Block.box(1, 26, 2, 15, 28, 3),
            Block.box(2, 28, 2, 14, 29, 3),
            Block.box(2, 28, 2, 14, 29, 3),
            Block.box(3, 14, 2, 13, 15, 3),
            Block.box(13, 11, 2, 14, 26, 3),
            Block.box(9, 15, 2, 10, 26, 3),
            Block.box(6, 15, 2, 7, 26, 3),
            Block.box(2, 11, 2, 3, 26, 3),
            Block.box(2, 0, 13, 3, 10, 14),
            Block.box(13, 0, 2, 14, 10, 3),
            Block.box(2, 0, 2, 3, 10, 3)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.box(13, 0, 2, 14, 10, 3),
            Block.box(13, 0.2, 2, 14, 0.3000000000000001, 3),
            Block.box(2, 0.2, 2, 3, 0.3, 3),
            Block.box(13, 0.2, 13, 14, 0.3000000000000001, 14),
            Block.box(2, 0.2, 13, 3, 0.3, 14),
            Block.box(2, 10, 2, 14, 11, 14),
            Block.box(3, 11, 3, 13, 11.5, 13),
            Block.box(4, 11.5, 4, 7.5, 12, 7.5),
            Block.box(1.75, 11.2, 1.75, 3.25, 11.7, 3.25),
            Block.box(1.75, 11.2, 12.75, 3.25, 11.7, 14.25),
            Block.box(4, 11.5, 8.5, 7.5, 12, 12),
            Block.box(8.5, 11.5, 8.5, 12, 12, 12),
            Block.box(8.5, 11.5, 4, 12, 12, 7.5),
            Block.box(2, 26, 1, 3, 28, 15),
            Block.box(2, 28, 2, 3, 29, 14),
            Block.box(2, 28, 2, 3, 29, 14),
            Block.box(2, 14, 3, 3, 15, 13),
            Block.box(2, 11, 2, 3, 26, 3),
            Block.box(2, 15, 6, 3, 26, 7),
            Block.box(2, 15, 9, 3, 26, 10),
            Block.box(2, 11, 13, 3, 26, 14),
            Block.box(13, 0, 13, 14, 10, 14),
            Block.box(2, 0, 2, 3, 10, 3),
            Block.box(2, 0, 13, 3, 10, 14)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_){
        switch (p_60555_.getValue(FACING)) {
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;
        }
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context){
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }
}
