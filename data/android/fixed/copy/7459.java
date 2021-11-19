private int getDistanceCategory(double distance) {
    return ((int) (java.lang.Math.min(java.lang.Math.floor((distance / (maximumDistance))), ((numberOfDistanceBins) - 1))));
}