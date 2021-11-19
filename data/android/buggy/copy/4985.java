public void startEvent() {
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, new drose379.ridefundraiser.GPSHelper.CustomLocationListener());
    drose379.ridefundraiser.TimeKeeper.getInstance(context).startClock();
    callback.updateStatus(true);
}