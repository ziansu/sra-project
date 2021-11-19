protected boolean isPassable(net.minecraft.util.math.BlockPos pos) {
    return isPassable(world.getBlockState(pos));
}