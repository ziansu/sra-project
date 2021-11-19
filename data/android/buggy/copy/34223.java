@java.lang.Override
public void onStart() {
    super.onStart();
    com.lkworm.miniservice.GPSTrackService.StartService(this);
    com.lkworm.miniservice.GPSTrackService.LogError(((com.lkworm.miniservice.MainActivity.TAG) + "onStart"));
    android.util.Log.d(com.lkworm.miniservice.MainActivity.TAG, "onStart");
}