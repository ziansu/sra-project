@java.lang.Override
public void removeFromRecyclerView(int position) {
    pendingList.remove(position);
    recyclerView.getAdapter().notifyItemRemoved(position);
}