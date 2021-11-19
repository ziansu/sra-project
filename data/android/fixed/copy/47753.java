@java.lang.Override
public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
    if ((adapter) != null)
        adapter.notifyItemMoved(fromPosition, toPosition);
    
}