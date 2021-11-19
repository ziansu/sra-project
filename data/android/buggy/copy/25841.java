@java.lang.Override
public boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
    if ((keyEvent.getKeyCode()) == (android.view.KeyEvent.KEYCODE_BACK)) {
        clearFocus();
    }
    return false;
}