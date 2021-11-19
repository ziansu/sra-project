@java.lang.Override
public boolean blockBroken(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos) {
    derpatiel.manafluidics.block.multiTank.TankFormingTileEntity tile = ((derpatiel.manafluidics.block.multiTank.TankFormingTileEntity) (world.getTileEntity(masterPos)));
    if (tile != null) {
        tile.unform();
        valid = false;
    }
    return true;
}