@org.junit.Test
public void blankWeatherDataLine() {
    org.agmip.core.types.WeatherDataLine test = new org.agmip.core.types.WeatherDataLine(new java.util.HashMap<java.lang.String, java.lang.Object>());
    assertEquals("Max Temperature", new java.lang.Double((-99.99)), test.getTempMax());
}