@java.lang.Override
public int getLightValue(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos) {
    if ((EnumOre.FIRESTONE) == (getVariant(mods.railcraft.common.plugins.forge.WorldPlugin.getBlockState(world, pos))))
        return 15;
    
    return super.getLightValue(state, world, pos);
}