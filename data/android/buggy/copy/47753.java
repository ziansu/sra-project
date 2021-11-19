@java.lang.Override
public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
    adapter.notifyItemMoved(fromPosition, toPosition);
}