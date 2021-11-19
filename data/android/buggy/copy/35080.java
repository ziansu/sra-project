public int obtainExtraMargin(android.view.View child, boolean isLayoutEnd) {
    if (child != null) {
        return computeAlignOffset(child, isLayoutEnd, true);
    }
    return 0;
}