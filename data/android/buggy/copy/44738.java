public void showAlertDialog() {
    android.app.AlertDialog.Builder am = new android.app.AlertDialog.Builder(this);
    am.setTitle(getString(R.string.gps_off_title));
    am.setMessage(getString(R.string.gps_off));
    am.show();
}