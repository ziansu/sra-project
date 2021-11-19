@java.lang.Override
public void onClick(android.view.View view) {
    mGoToPage = 1;
    sbGotoPage.setProgress(mGoToPage);
    mCurrentPage = mGoToPage;
    showOrLoadPage();
    dialog.dismiss();
}