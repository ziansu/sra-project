public void onWorldChunkLoad(int chunkX, int chunkZ) {
    net.minecraft.world.ChunkCoordIntPair relChunk = mrpf1ster.flyingships.util.BlockUtils.getRelativeChunkFromWorld(chunkX, chunkZ, this.theShipWorldServer.OriginPos());
    this.getPlayerInstance(relChunk.chunkXPos, relChunk.chunkZPos, true);
}