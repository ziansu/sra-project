private java.lang.String formatPrecipitation(double value) {
    return java.lang.String.format((((com.endava.abondarenco.weatherapp.forecasts.ForecastsFormatter.DOUBLE_FORMAT) + (com.endava.abondarenco.weatherapp.forecasts.ForecastsFormatter.VALUE_UNITS_SEPARATOR)) + (com.endava.abondarenco.weatherapp.forecasts.ForecastsFormatter.PRECIPITATION_UNITS)), value);
}