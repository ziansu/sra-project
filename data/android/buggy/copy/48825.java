public int getPrecip() {
    double precipPercentage = (mPrecipitation) * 100;
    return ((int) (java.lang.Math.round(precipPercentage)));
}