@java.lang.Override
public boolean canSwipeRefreshChildScrollUp() {
    if ((mRecyclerView) != null)
        return android.support.v4.view.ViewCompat.canScrollVertically(mRecyclerView, (-1));
    
    return false;
}