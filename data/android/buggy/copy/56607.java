public void updateScaleData(com.health.openscale.core.datatypes.ScaleData scaleData) {
    scaleDB.updateEntry(android.R.attr.id, scaleData);
    alarmHandler.entryChanged(context, scaleData);
    updateScaleData();
}