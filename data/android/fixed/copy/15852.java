@java.lang.Override
public void onConnected(android.os.Bundle arg0) {
    mSwipeRefreshLayout.setRefreshing(true);
    startLocationUpdates();
}