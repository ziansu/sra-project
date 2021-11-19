@java.lang.Override
public boolean isSurfaceWorld() {
    getDimensionInformation();
    if ((dimensionInformation) == null) {
        return super.isSurfaceWorld();
    }
    return dimensionInformation.getTerrainType().hasSky();
}