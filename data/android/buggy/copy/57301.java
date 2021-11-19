@java.lang.Override
public boolean tryCaptureView(android.view.View child, int pointerId) {
    if (mIsUnableToDrag) {
        return false;
    }
    return child == (mSlideableView);
}