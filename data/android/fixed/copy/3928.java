private void createDialog() {
    transDialog = new android.support.v7.app.AlertDialog.Builder(context, getDialogStyle()).setView(transLayout).create();
    transDialog.setOnShowListener(this);
    transDialog.setOnKeyListener(this);
}