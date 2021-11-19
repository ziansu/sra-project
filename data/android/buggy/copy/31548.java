@java.lang.Override
public void didEnterRegion(org.altbeacon.beacon.Region region) {
    android.util.Log.i(com.liferay.ldxdemo.app.ShopApplication.TAG, "I just saw an beacon for the first time!");
    com.liferay.ldxdemo.beacon.NotificationUtil.sendNotification(getApplicationContext());
}