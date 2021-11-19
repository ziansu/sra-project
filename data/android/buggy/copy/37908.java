public void populate(net.minecraft.world.chunk.IChunkProvider ichunkprovider, int chunkX, int chunkZ) {
    if (this.neighborsDone(ichunkprovider, chunkX, chunkZ)) {
        this.doPopulate(ichunkprovider, chunkX, chunkZ);
    }
    clearToDecorateList(ichunkprovider);
}