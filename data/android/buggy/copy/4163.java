void storeInCache(int zoom, long key, com.gluonhq.impl.maps.MapTile tile) {
    java.lang.System.out.println("store in cache");
    com.gluonhq.impl.maps.MapTile orig = cache[zoom].get(key);
    cache[zoom].put(key, tile);
}