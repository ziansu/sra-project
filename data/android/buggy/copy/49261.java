@java.lang.Override
public void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
    if (after < count) {
        for (int i = 0; i < (count - after); i++) {
            backspacePressed();
        }
    }
}