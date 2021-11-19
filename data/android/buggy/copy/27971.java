@java.lang.Override
public void onScrolled(int dx, int dy) {
    super.onScrolled(dx, dy);
    boolean lastItemVisible = isLastItemVisible();
    if (lastItemVisible) {
        mOnLastItemVisibleListener.onLastItemVisible();
    }
}