public short[] getRouteData() {
    short[] array = java.util.Arrays.copyOfRange(this.genes, travellingappraiser.geneticAlgorithm.TOTAL_LOCATIONS, ((TOTAL_LOCATIONS) + (ROUTES)));
    return array;
}