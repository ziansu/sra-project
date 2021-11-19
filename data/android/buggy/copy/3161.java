static int locationMapping(double axisMin, double axisLocation, double axisMax) {
    java.lang.Double gridLocation;
    int gridResolution = java.lang.Short.MAX_VALUE;
    gridLocation = ((axisLocation - axisMin) * gridResolution) / (axisMax - axisMin);
    return gridLocation.intValue();
}