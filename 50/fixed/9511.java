public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    mAdapter.onItemDismiss(viewHolder.getAdapterPosition());
    moving = true;
}