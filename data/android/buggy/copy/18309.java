@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    if (mShowDialog) {
        mCustomProgressDialog.showProgress("");
    }
}