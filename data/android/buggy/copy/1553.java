@java.lang.Override
public void onItemRangeRemoved(int positionStart, int itemCount) {
    adapter.notifyItemRangeRemoved(positionStart, itemCount);
}