@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    android.util.Log.d("ModuleManager", "OnSwipe called");
    viewHolder.itemView.setX(0);
    adapter.onItemDismiss(viewHolder);
}