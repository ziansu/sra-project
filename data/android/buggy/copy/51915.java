@java.lang.Override
public boolean canPlaceBlockAt(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos) {
    return !(pl.asie.charset.module.storage.tanks.TileTank.checkPlacementConflict(worldIn.getTileEntity(pos.down()), worldIn.getTileEntity(pos.up())));
}