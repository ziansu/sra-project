private void showAlert(java.lang.String title, java.lang.CharSequence message) {
    new android.support.v7.app.AlertDialog.Builder(this).setTitle(title).setMessage(message).setPositiveButton(getString(R.string.ok), null).create().show();
}