@java.lang.Override
public boolean isSurfaceWorld() {
    getDimensionInformation();
    return dimensionInformation.getTerrainType().hasSky();
}