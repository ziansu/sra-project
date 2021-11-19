@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if (((v.getScrollY()) == 0) && ((mCurrentViewIndex) == 1)) {
        canPullDown = true;
    }else {
        canPullDown = false;
    }
    return false;
}