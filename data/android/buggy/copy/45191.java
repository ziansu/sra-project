@java.lang.Override
public void onRefresh() {
    loadNewDataFromApi(adapter.getItem(0).uid);
    swipeContainer.setRefreshing(false);
}