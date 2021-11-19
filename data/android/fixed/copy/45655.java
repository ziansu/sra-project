@java.lang.Override
public void onClick(android.view.View view) {
    if ((mCurrentPage) > 1) {
        (mCurrentPage)--;
        showOrLoadPage();
    }
    dialog.dismiss();
}