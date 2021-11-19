@java.lang.Override
public void onWeatherError(com.survivingwithandroid.weather.lib.exception.WeatherLibException e) {
    temp.setText("Weather Error - parsing data");
    e.printStackTrace();
}