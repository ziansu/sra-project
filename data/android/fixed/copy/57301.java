@java.lang.Override
public boolean tryCaptureView(android.view.View child, int pointerId) {
    return (!(mIsUnableToDrag)) && (child == (mSlideableView));
}