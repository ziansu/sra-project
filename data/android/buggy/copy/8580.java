@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    mStationMapFragment.redrawMarkers();
    mStationMapFragment.lookingForBikes(mParkingSwitch.isChecked());
}