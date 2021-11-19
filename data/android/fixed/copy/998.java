@java.lang.Override
public void onClickBtnOK(android.view.View v) {
    mDBHelper.deleteUser(mUsers.get(mPosition));
    mUsers.remove(mPosition);
    dialog.dismiss();
}