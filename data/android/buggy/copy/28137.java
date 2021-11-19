@java.lang.Override
public boolean stealTouchEventForChild() {
    if ((mRecyclerView) == null) {
        return false;
    }
    android.support.v7.widget.LinearLayoutManager lm = ((android.support.v7.widget.LinearLayoutManager) (mRecyclerView.getLayoutManager()));
    return (lm.findFirstCompletelyVisibleItemPosition()) != 0;
}