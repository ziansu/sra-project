@java.lang.Override
public void hideKeyboard() {
    android.view.inputmethod.InputMethodManager manager = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    android.view.View view = getCurrentFocus();
    if (view != null) {
        manager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}