@java.lang.Override
public void onPause() {
    super.onPause();
    timeExecutorService.shutdown();
}