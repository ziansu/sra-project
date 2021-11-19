@butterknife.OnEditorAction
boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    return actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE);
}