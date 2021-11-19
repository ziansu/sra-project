@java.lang.Override
public void onClick(android.view.View v) {
    int nextPage = mCurrentPage.getChoice1().getNextPage();
    loadPage(nextPage);
}