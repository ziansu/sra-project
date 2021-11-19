public static android.app.Application getContext() {
    synchronized(com.laocuo.weather.WeatherApp.ob) {
        if ((com.laocuo.weather.WeatherApp.instance) == null) {
            com.laocuo.weather.WeatherApp.instance = new com.laocuo.weather.WeatherApp();
        }
    }
    return com.laocuo.weather.WeatherApp.instance;
}