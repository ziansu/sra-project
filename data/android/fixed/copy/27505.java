@java.lang.Override
public void onItemClicked(int position, int gameID) {
    toggleSelection(position, gameID);
    if ((actionMode) != null) {
        actionMode.setTitle(((historyAdapter.getSelectedItemCount()) + " items selected"));
    }
}