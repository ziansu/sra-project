@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    java.lang.CharSequence word = bookView.getWordAt(e.getX(), e.getY());
    if (word != null) {
        selectedWord = word;
        openContextMenu(bookView);
    }
}