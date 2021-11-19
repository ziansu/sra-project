private java.lang.String getJsonStringForWeatherInfo(android.database.Cursor cursor) {
    java.lang.String weatherInfoJsonString = null;
    if (!(recordNeedsToBeUpdatedForWeatherInfo(cursor))) {
        int columnIndexForWeatherInfo = cursor.getColumnIndexOrThrow(columnNameForJsonString);
        weatherInfoJsonString = cursor.getString(columnIndexForWeatherInfo);
    }
    return weatherInfoJsonString;
}