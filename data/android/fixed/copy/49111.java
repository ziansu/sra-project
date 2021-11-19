public int getCostPerPointSoFar() {
    if ((getCompletedPoints()) == 0) {
        return 0;
    }
    return java.lang.Math.round((((float) (getCostSoFar())) / ((float) (getCompletedPoints()))));
}