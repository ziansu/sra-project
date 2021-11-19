@java.lang.Override
protected void onSelectionChanged(int selStart, int selEnd) {
    onSelectionChangedListener.onSelectionChanged(selStart, selEnd);
}