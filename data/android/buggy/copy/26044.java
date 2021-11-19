@java.lang.Override
public void onClick(android.view.View view) {
    if ((mCurrentPage) < (mMaxPage)) {
        sbGotoPage.setProgress(mCurrentPage);
    }
    mCurrentPage = mGoToPage;
    showOrLoadPage();
    dialog.dismiss();
}