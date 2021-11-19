@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    v.clearFocus();
    hideKeyBoard(v);
    return false;
}