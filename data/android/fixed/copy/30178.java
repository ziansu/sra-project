@java.lang.Override
public void onItemRangeRemoved(int positionStart, int itemCount) {
    mWrapAdapter.notifyItemRangeRemoved(positionStart, itemCount);
}