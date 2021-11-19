private void make(java.lang.Iterable<? extends com.xor.tiles.Tile> buildBatch) {
    for (com.xor.tiles.Tile toBuild : buildBatch)
        if (isFree(toBuild))
            make(toBuild);
        
    
}