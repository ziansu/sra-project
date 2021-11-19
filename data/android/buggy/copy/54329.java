@java.lang.Override
public void onLoading() {
    android.util.Log.d("onLoading", ("category:" + (category)));
    swipeRefresh.setRefreshing(true);
}