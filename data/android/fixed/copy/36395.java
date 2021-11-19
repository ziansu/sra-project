private java.lang.String getJsonStringForWeatherInfo(android.database.Cursor cursor) {
    int columnIndexForWeatherInfo = cursor.getColumnIndexOrThrow(columnNameForJsonString);
    return cursor.getString(columnIndexForWeatherInfo);
}