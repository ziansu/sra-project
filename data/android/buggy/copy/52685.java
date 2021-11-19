@java.lang.Override
protected void onStop() {
    super.onStop();
    bits = null;
    java.lang.System.gc();
    mAesthetic2View.getThread().setRunning(false);
    unbindDrawables(findViewById(R.id.aes2));
    java.lang.System.gc();
}