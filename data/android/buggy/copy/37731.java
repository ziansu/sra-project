@java.lang.Override
protected void onDestroy() {
    android.util.Log.d(io.evercam.androidapp.video.VideoActivity.TAG, "onDestroy");
    super.onDestroy();
    nativeStop();
    nativeFinalize();
    nativeSurfaceFinalize();
}