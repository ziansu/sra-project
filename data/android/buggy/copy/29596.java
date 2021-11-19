public void showAlertDialog() {
    android.app.Dialog alertDialog = new android.app.Dialog(mainActivity, R.style.DialogTheme);
    alertDialog.setContentView(R.layout.custom_alert_dialog);
    alertDialog.show();
}