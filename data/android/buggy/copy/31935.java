public com.joe.holi.view.TrendView setTrendPointDesc(java.lang.Boolean isDay, java.lang.String... trendPointDesc) {
    this.trendPointDesc = trendPointDesc;
    if (isDay == null) {
        drawWeather = false;
    }else {
        drawWeather = true;
        initWeatherRenderers(isDay, trendPointDesc);
    }
    return this;
}