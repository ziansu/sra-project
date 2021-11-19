@java.lang.Override
public void run() {
    for (android.support.v4.widget.SwipeRefreshLayout current : com.zigapk.gimvic.suplence.Main.swipeRefreshLayouts) {
        current.setRefreshing(state);
    }
    if (state)
        android.support.design.widget.Snackbar.make(com.zigapk.gimvic.suplence.Main.coordinatorLayout, R.string.refreshed, Snackbar.LENGTH_SHORT).show();
    
}