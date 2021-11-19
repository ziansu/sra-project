@java.lang.Override
public net.minecraft.block.state.IBlockState getStateFromMeta(int meta) {
    return this.getDefaultState().withProperty(net.came20.mods.simplemachines.blocks.BlockSimpleMachinesDirectional.FACING, net.minecraft.util.EnumFacing.getHorizontal(meta));
}