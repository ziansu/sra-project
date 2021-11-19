@java.lang.Override
public void run() {
    enterBarcode.requestFocus();
    android.view.inputmethod.InputMethodManager inputMethodManager = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    inputMethodManager.showSoftInput(enterBarcode, InputMethodManager.SHOW_IMPLICIT);
}