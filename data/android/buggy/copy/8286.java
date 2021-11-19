@java.lang.Override
public void onClick(android.view.View v) {
    mDbAdapter.resetWordStatus(id);
    mCursorAdapter.changeCursor(mDbAdapter.fetchWordsByTrained(null, java.lang.Integer.MAX_VALUE, java.lang.Integer.MAX_VALUE));
    dialog.dismiss();
}