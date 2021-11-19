@java.lang.Override
public void onRefresh() {
    new com.hoover.linkedinoauth.HomeFragment.GetHoovsAsyncTask().execute(params);
    if (refreshLayout.isRefreshing()) {
        refreshLayout.setRefreshing(false);
    }
}