@java.lang.Override
public net.minecraft.util.EnumFacing getBedDirection(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos) {
    return state.getValue(micdoodle8.mods.galacticraft.planets.mars.blocks.BlockMachineMars.FACING);
}