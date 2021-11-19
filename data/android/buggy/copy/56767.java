@java.lang.Override
public void onRefresh() {
    new com.hoover.linkedinoauth.HomeFragment.GetHoovsAsyncTask().doInBackground(params);
    if (refreshLayout.isRefreshing()) {
        refreshLayout.setRefreshing(false);
    }
}