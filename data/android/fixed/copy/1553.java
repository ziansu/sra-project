@java.lang.Override
public void onItemRangeRemoved(int positionStart, int itemCount) {
    if ((adapter) != null)
        adapter.notifyItemRangeRemoved(positionStart, itemCount);
    
}