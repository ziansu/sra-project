@java.lang.Override
protected void onSelectionChanged(int selStart, int selEnd) {
    if ((onSelectionChangedListener) != null) {
        onSelectionChangedListener.onSelectionChanged(selStart, selEnd);
    }
}