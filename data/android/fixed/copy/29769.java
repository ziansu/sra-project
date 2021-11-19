private android.content.ContentValues monitoringAreaToContentValues(de.jordsand.birdcensus.core.MonitoringArea area) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(BirdCountContract.MonitoringArea.COLUMN_NAME_CODE, area.getCode());
    values.put(BirdCountContract.MonitoringArea.COLUMN_NAME_NAME, area.getName());
    return values;
}