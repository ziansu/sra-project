protected void onPreExecute() {
    this.dialog = new android.app.ProgressDialog(this);
    this.dialog.setMessage("Please wait while finishing the installation...");
    this.dialog.show();
    dialog.setCanceledOnTouchOutside(false);
    dialog.setCancelable(false);
}