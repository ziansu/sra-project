@java.lang.Override
public void onRefresh() {
    refreshview.setRefreshing(false);
    page = 1;
    requsetTransaction();
}