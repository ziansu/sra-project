@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if (listenerLongClick == null) {
        return false;
    }
    listenerLongClick.onCellSelected(row, col);
    return false;
}