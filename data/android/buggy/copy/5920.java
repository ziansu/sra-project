@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.e(com.example.franz.wordreminder.MainActivity.LOG_TAG, "leaving this activity");
    timeExecutorService.shutdown();
}