protected void onPreExecute() {
    this.dialog = new android.app.ProgressDialog(this);
    this.dialog.setMessage("Please wait while finishing the installation...");
    dialog.setCanceledOnTouchOutside(false);
    dialog.setCancelable(false);
    this.dialog.show();
}