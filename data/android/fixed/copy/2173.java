private void queueChunkForUpdate(com.lithia.cs.core.world.Chunk c) {
    if (c != null)
        chunkUpdateQueue.add(c);
    
}