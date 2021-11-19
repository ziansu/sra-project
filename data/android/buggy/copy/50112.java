private boolean isPercentageInfectedWithinTargetRange(float targetPercentage) {
    return (java.lang.Math.abs((targetPercentage - (getTotalPercentageInfected())))) < (delta);
}