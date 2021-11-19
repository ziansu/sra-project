public void removeMyNoteView(android.view.ViewGroup parent) {
    boolean isMynoteTextEdit = isMyNoteViewShowing(parent);
    if (isMynoteTextEdit) {
        parent.setTag("");
        parent.removeView(myNoteText);
        mainActivity.unregisterForContextMenu(myNoteText);
    }
}