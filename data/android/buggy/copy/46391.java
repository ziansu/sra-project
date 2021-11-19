@java.lang.Override
public void onDeleteClicked(int position) {
    swipeRecyclerViewItems.remove(mergeAdapter.getLocalPosition(position));
    mergeAdapter.notifyItemRemoved(swipeRecyclerViewAdapter, position);
    swipeRecyclerView.closeOpenedItem();
}