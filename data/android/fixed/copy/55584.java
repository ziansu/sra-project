@java.lang.Override
protected void onPreExecute() {
    refreshLayout = ((android.support.v4.widget.SwipeRefreshLayout) (((com.example.djordje.seeds.MainActivity) (context)).findViewById(R.id.swiperefresh)));
    refreshLayout.setRefreshing(true);
}