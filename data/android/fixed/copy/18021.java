@java.lang.Override
protected void onSelectionChanged(int selStart, int selEnd) {
    if (selStart <= selEnd) {
        currentSelection = getText().toString().substring(selStart, selEnd);
    }
    super.onSelectionChanged(selStart, selEnd);
}