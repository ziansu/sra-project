@java.lang.Override
public boolean onEditorAction(android.widget.TextView textView, int id, android.view.KeyEvent keyEvent) {
    if ((id == (R.id.login)) || (id == (android.view.inputmethod.EditorInfo.IME_NULL))) {
        attemptLogin();
        return true;
    }
    return false;
}