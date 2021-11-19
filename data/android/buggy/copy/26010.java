@java.lang.Override
public void onDestroyActionMode(android.support.v7.view.ActionMode mode) {
    enableSelectionMode(false);
    runSelection(false);
    allGpxAdapter.notifyDataSetChanged();
}