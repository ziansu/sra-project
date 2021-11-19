@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.d(org.omnirom.omnijaws.WeatherLocationListener.TAG, "The location has changed, schedule an update ");
    synchronized(org.omnirom.omnijaws.WeatherLocationListener.class) {
        org.omnirom.omnijaws.WeatherService.startUpdate(mContext, true);
        cancelTimeoutAlarm();
        org.omnirom.omnijaws.WeatherLocationListener.sInstance = null;
    }
}