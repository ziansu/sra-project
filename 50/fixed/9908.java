@java.lang.Override
public void onRefresh() {
    fetchRequests();
    swipeLayoutRequests.setRefreshing(false);
}