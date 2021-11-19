@java.lang.Override
public void onClick(android.view.View view) {
    if ((mCurrentPage) > 1) {
        sbGotoPage.setProgress(((mCurrentPage) - 2));
    }
    mCurrentPage = mGoToPage;
    showOrLoadPage();
    dialog.dismiss();
}