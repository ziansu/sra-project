@java.lang.Override
public net.minecraft.tileentity.TileEntity createNewTileEntity(net.minecraft.world.World world, int meta) {
    net.minecraft.tileentity.TileEntity te = new com.mhfs.capacitors.tile.TileCapacitor(false);
    te.setWorldObj(world);
    return te;
}