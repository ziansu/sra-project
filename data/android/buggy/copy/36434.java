@java.lang.Override
public void onWeatherError(com.survivingwithandroid.weather.lib.exception.WeatherLibException e) {
    textView2.setText("Weather Error - parsing data");
    e.printStackTrace();
}