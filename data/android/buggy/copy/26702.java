public void hideKeyboard() {
    if (isKeyboardUp) {
        mImm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
        isKeyboardUp = false;
        if ((mStateChangeListener) != null) {
            mStateChangeListener.onKeyboardClosed();
        }
    }
}