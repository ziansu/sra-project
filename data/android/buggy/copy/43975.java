@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d(com.lkworm.miniservice.MainActivity.TAG, "onPause");
    com.lkworm.miniservice.GPSTrackService.LogError(((com.lkworm.miniservice.MainActivity.TAG) + "onPause"));
}