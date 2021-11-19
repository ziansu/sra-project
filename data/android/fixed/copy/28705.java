public synchronized void refreshWeather(java.util.List<com.kuahusg.weather.model.Forecast> list) {
    if (list != null) {
        forecastList = list;
    }
    initId();
    i = 1;
}