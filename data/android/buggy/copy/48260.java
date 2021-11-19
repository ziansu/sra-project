@java.lang.Override
public void onTrigger(android.hardware.TriggerEvent event) {
    speedCalc();
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, minTime, 30, locListener);
}