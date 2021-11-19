public com.mousebird.maply.LayerThread getLayerThread() {
    if ((layerThreads) == null)
        return null;
    
    synchronized(layerThreads) {
        if ((layerThreads.size()) == 0)
            return null;
        
        return layerThreads.get(0);
    }
}