@java.lang.Override
public void onSelectionChanged(int selStart, int selEnd) {
    if ((selStart != (lastCursorPosition)) && (selStart != 0)) {
        lastCursorPosition = selStart;
        updateContent(selStart);
        setEditTextBody(selStart);
    }
}