@java.lang.Override
public void onRefresh() {
    curPage = 1;
    mJokeAdapter.removeAll();
    requestData();
}