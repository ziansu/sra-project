protected java.lang.String getHumanMarkers(int gridClusterKey) throws java.lang.Exception {
    if ((gcToHumanMarkers) == null) {
        cacheGridClusterMarkers();
    }
    if (gcToHumanMarkers.containsKey(gridClusterKey)) {
        return gcToHumanMarkers.get(gridClusterKey);
    }
    return null;
}