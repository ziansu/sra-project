@java.lang.Override
public void onGlobalLayout() {
    if ((mScreenChangedListener) != null) {
        getWindowVisibleDisplayFrame(mWindowRect);
        mScreenChangedListener.onScreenChanged((((mLastUiVisibility) != (android.view.View.SYSTEM_UI_FLAG_VISIBLE)) || ((mWindowRect.top) == 0)));
    }
}