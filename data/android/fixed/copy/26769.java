public static synchronized com.tinyweather.model.TinyWeatherDB getInstance(android.content.Context context) {
    if ((com.tinyweather.model.TinyWeatherDB.tinyWeatherDB) == null) {
        com.tinyweather.model.TinyWeatherDB.tinyWeatherDB = new com.tinyweather.model.TinyWeatherDB(context);
    }
    return com.tinyweather.model.TinyWeatherDB.tinyWeatherDB;
}