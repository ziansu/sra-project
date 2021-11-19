public void saveFutureDorecasts(java.util.List<com.hfad.weatherforecast.model.future.FutureForecast> futureForecasts) throws java.sql.SQLException {
    for (com.hfad.weatherforecast.model.future.FutureForecast forecast : futureForecasts) {
        mDatabaseHelper.getdHoursDao().create(((java.util.Collection<com.hfad.weatherforecast.model.GeoData.Hours>) (forecast)));
    }
}