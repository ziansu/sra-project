public void onEntityCollidedWithBlock(net.minecraft.world.World worldIn, net.minecraft.util.BlockPos pos, net.minecraft.block.state.IBlockState state, net.minecraft.entity.Entity entityIn) {
    worldIn.destroyBlock(pos, false);
}