@java.lang.Override
public void onPause() {
    android.util.Log.i(com.tapifolti.emotiondetection.EmotionDetectionFragment.TAG, "onPause() called");
    mAppIsResumed = false;
    mUIHandler.removeCallbacks(takePictureTask);
    stopBackgroundThreads();
    closeCamera();
    super.onPause();
}