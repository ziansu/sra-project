@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    dialog = new com.llp.lunchkaki.helpers.MyCustomProgressDialog(self, R.style.MyCustomProgressDialog);
    dialog.show();
    arr_messages.add(getString(R.string.uploading_animation));
    showAlert();
}