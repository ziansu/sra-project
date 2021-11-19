@java.lang.Override
public void onRefresh() {
    currentPageToLoad = 1;
    performRequest(1, true);
}