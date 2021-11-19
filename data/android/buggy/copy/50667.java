public void onClick(android.content.DialogInterface dialog, int id) {
    A.db.setTransactionSuccessful();
    A.db.endTransaction();
    dialog.cancel();
    act.goHome();
}