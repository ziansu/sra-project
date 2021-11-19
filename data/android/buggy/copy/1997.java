@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.e("Test", "Start");
    progressDialog.setMessage("Loading dates from yahoo...");
    progressDialog.setCancelable(false);
    progressDialog.show();
}