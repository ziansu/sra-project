private void clearChunks() {
    if ((_current) == null)
        return ;
    
    for (com.jcwhatever.nucleus.utils.coords.Coords2Di coord : _chunks)
        com.jcwhatever.nucleus.npc.traits.ChunkLoaderTrait._keepLoaded.subtract(coord);
    
    _current = null;
    _chunks.clear();
}