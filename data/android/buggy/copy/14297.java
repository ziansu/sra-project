private void clearInternalBlocks(boolean chunkUnloading) {
    blockCount = 0;
    for (forestry.api.greenhouse.ILogicBlockHandler handler : getHandlers()) {
        handler.clearBlocks(this, chunkUnloading, startPos);
    }
}