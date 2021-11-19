@java.lang.Override
protected void onResume() {
    super.onResume();
    if (mPaused) {
        broadcastResult(new android.content.Intent(), Activity.RESULT_CANCELED);
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}