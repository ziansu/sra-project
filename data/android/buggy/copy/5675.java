private void doubleArraySize() {
    int currentSize = temperatureSeries.length;
    int newSize = currentSize * 2;
    double[] newTempSeries = new double[newSize];
    newTempSeries = java.util.Arrays.copyOf(temperatureSeries, newSize);
    temperatureSeries = newTempSeries;
}