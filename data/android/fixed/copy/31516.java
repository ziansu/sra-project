@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    progressDialog = new android.app.ProgressDialog(getContext());
    progressDialog.setTitle("LOADING");
    progressDialog.show();
}