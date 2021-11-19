public com.kodatos.cumulonimbus.apihelper.DBModel getDBModel() {
    com.kodatos.cumulonimbus.apihelper.models.Weather w = weather.get(0);
    return new com.kodatos.cumulonimbus.apihelper.DBModel(1L, w.main, w.description, mainCurrent.temp, mainCurrent.tempMin, mainCurrent.tempMax, mainCurrent.pressure, mainCurrent.humidity, wind.getUsefulWind());
}