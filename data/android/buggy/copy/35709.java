private void normalizeDate(android.content.ContentValues values) {
    if (values.containsKey(WeatherContract.WeatherEntry.COLUMN_DATE)) {
        long dateValue = values.getAsLong(WeatherContract.WeatherEntry.COLUMN_DATE);
        values.put(WeatherContract.WeatherEntry.COLUMN_DATE, com.example.tgzoom.sunshine.data.WeatherContract.normalizeDate(dateValue));
    }
}