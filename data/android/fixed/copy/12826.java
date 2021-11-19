private boolean hasWaterSource(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos) {
    return (world.getBlockState(pos.add(0, (-2), 0))) == (Blocks.WATER.getDefaultState());
}