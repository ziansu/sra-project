public static void initgvSIGWriteDrivers(java.lang.String driversPath) {
    com.iver.cit.gvsig.fmap.layers.LayerFactory.setWritersPath(driversPath);
    if ((com.iver.cit.gvsig.fmap.layers.LayerFactory.getWM().getWriterNames().length) < 1) {
        throw new java.lang.RuntimeException(("Can't find writers in path: " + driversPath));
    }
}