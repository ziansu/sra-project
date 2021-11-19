@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((getSelectedItemCount()) == 0) {
        recentListActionModeUtil.startActionMode();
    }
    toggleSelection(position);
    recentListActionModeUtil.updateActionMode(getSelectedItemCount());
    return true;
}