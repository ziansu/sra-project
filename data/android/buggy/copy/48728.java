@java.lang.Override
public void onBackPressed() {
    android.util.Log.i(TAG, "onBackPressed - start");
    savingModelInDb();
    setResult(com.modelingbrain.home.detailModel.RESULT_OK);
    super.onBackPressed();
    android.util.Log.i(TAG, "onBackPressed - finish");
}