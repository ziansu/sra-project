@java.lang.Override
public void onDestroy() {
    if (null != (scheduleService)) {
        scheduleService.cancel();
    }
    mLocationClient.stopLocation();
    mLocationClient.onDestroy();
    stopSelf();
    super.onDestroy();
}