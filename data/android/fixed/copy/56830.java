@java.lang.Override
public void entityInit() {
    dataWatcher.addObject(16, (-1));
    dataWatcher.addObject(17, 0);
    chunkLoaderInit(net.minecraftforge.common.ForgeChunkManager.requestTicket(DefenseTech.INSTANCE, worldObj, Type.ENTITY));
}