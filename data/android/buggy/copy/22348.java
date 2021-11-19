@java.lang.Override
public void onDestroyActionMode(android.support.v7.view.ActionMode mode) {
    enableSelectionMode(false);
    getView().findViewById(R.id.DescriptionText).setVisibility(View.GONE);
    runSelection(false);
    listAdapter.notifyDataSetChanged();
}