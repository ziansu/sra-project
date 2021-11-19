public static void submit(java.lang.String key, org.openstreetmap.josm.plugins.mapillary.cache.MapillaryCache.Type type, org.openstreetmap.josm.data.cache.ICachedLoaderListener lis) {
    try {
        new org.openstreetmap.josm.plugins.mapillary.cache.MapillaryCache(key, type).submit(lis, false);
    } catch (java.io.IOException e) {
        org.openstreetmap.josm.Main.error(e);
    }
}