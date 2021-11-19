public void onClick(android.content.DialogInterface dialog, int whichButton) {
    mParseTools.markChargePaid(mTransactionObjectId, true);
    finish();
}