@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if (!(mCalculatorKeyboard.isCustomKeyboardVisible()))
        mCalculatorKeyboard.showCustomKeyboard(v);
    
    onTouchEvent(event);
    return false;
}