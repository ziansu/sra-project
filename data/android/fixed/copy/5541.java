public void defineArrayMap(java.lang.String mapName, int length) {
    defineMap(mapName, com.stremebase.map.ArrayMap.class, props().add(Catalog.NODESIZE, (length + 1)).build(), false);
}