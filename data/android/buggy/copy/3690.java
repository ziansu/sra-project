@java.lang.Override
public synchronized void run() {
    if (!(isAdded())) {
        return ;
    }
    mAdapter.updateDataSet(mItemList);
    if ((mLoading) != null) {
        mLoading.setVisibility(View.INVISIBLE);
    }
}