@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        dialog.dismiss();
        renameItem(fileInfo, nameField.getText().toString());
    }
    return false;
}