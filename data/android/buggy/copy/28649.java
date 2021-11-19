@java.lang.Override
public synchronized void run() {
    if (!(fragment.isAdded())) {
        return ;
    }
    adapter.updateDataSet(fragment.mItemList);
    if ((fragment.mLoading) != null) {
        fragment.mLoading.setVisibility(View.INVISIBLE);
    }
}