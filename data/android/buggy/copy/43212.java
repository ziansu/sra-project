@java.lang.Override
public void onItemClick(io.github.prashantsolanki3.snaplibrary.snap.layout.viewholder.SnapViewHolder viewHolder, android.view.View view, int position) {
    if ((isSelectionEnabled()) && (io.github.prashantsolanki3.snaplibrary.snap.utils.UtilsLayoutWrapper.isViewHolderSelectable(getLayoutWrappers(), ((io.github.prashantsolanki3.snaplibrary.snap.layout.viewholder.SnapSelectableViewHolder) (viewHolder))))) {
        toggleSelection(position);
    }
}