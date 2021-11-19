@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    running = true;
    progressDialog = android.app.ProgressDialog.show(this, "", "Please wait...", true, false);
    progressDialog.setCanceledOnTouchOutside(true);
}