@java.lang.Override
protected void onPause() {
    android.util.Log.i(TAG, "onPause - start");
    setResult(com.modelingbrain.home.detailModel.RESULT_OK);
    super.onPause();
    android.util.Log.i(TAG, "onPause - finish");
}