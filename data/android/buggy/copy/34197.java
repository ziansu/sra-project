@java.lang.Override
public void onStop() {
    super.onStop();
    android.util.Log.e("Test", "Stop");
    if (progressDialog.isShowing()) {
        progressDialog.dismiss();
        progressDialog.hide();
    }
}