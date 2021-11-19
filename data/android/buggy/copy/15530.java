private static synchronized com.example.test.myweather.database.MyWeatherDB getInstance(android.content.Context context) {
    com.example.test.myweather.database.MyWeatherDB.myWeatherDB = new com.example.test.myweather.database.MyWeatherDB(context);
    return com.example.test.myweather.database.MyWeatherDB.myWeatherDB;
}