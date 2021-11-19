private boolean make(java.lang.Iterable<? extends com.xor.tiles.Tile> buildBatch) {
    for (com.xor.tiles.Tile toBuild : buildBatch)
        if (!(isFree(toBuild)))
            return false;
        
    
    for (com.xor.tiles.Tile toBuild : buildBatch)
        make(toBuild);
    
    return true;
}