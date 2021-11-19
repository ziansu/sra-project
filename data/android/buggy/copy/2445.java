public double LonToX(double aLongitude, int aZoomlevel) {
    int mp = getMaxPixels(aZoomlevel);
    double x = (mp * (aLongitude + 180L)) / 360L;
    return java.lang.Math.min(x, (mp - 1));
}