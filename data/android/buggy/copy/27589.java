@android.annotation.SuppressLint(value = "DefaultLocale")
private java.lang.String formatPressure(double pressure) {
    return java.lang.String.format((((com.endava.abondarenco.weatherapp.forecasts.ForecastsFormatter.DOUBLE_FORMAT) + (com.endava.abondarenco.weatherapp.forecasts.ForecastsFormatter.VALUE_UNITS_SEPARATOR)) + (com.endava.abondarenco.weatherapp.forecasts.ForecastsFormatter.PRESSURE_UNITS)), pressure);
}