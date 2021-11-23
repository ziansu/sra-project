@org.junit.Test(expected = java.util.InputMismatchException.class)
public void testAddTempsTooSmall() {
    double[] temperatureSeries = new double[]{  };
    ua.edu.ucu.tempseries.TemperatureSeriesAnalysis seriesAnalysis = new ua.edu.ucu.tempseries.TemperatureSeriesAnalysis(temperatureSeries);
    seriesAnalysis.addTemps(2, (-300));
}