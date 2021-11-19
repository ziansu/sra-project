private void createDialog() {
    transDialog = new android.support.v7.app.AlertDialog.Builder(com.hitomi.tilibrary.transfer.Transferee.context, getDialogStyle()).setView(transLayout).create();
    transDialog.setOnShowListener(this);
    transDialog.setOnKeyListener(this);
}