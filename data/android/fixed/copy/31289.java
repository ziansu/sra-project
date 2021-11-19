public int getCurrentCaretPosition() {
    int position = -1;
    if (openedInEditor) {
        position = getCaret().getDot();
    }
    return position;
}