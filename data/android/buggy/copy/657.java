@java.lang.Override
protected void onPostExecute(com.info.weather.Weather weather) {
    com.info.weather.WeatherWidget.mWeather = com.info.weather.WeatherWidget.setWeather(weather);
    onUpdate(context, android.appwidget.AppWidgetManager.getInstance(context), intent.getExtras().getIntArray(AppWidgetManager.EXTRA_APPWIDGET_IDS));
}