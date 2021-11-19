@java.lang.Override
public void onPause() {
    android.util.Log.i(com.tapifolti.emotiondetection.EmotionDetectionFragment.TAG, "onPause() called");
    mAppIsResumed = false;
    mUIHandler.removeCallbacks(takePictureTask);
    closeCamera();
    stopBackgroundThreads();
    super.onPause();
}