public void setHeight(int height) {
    getMarginLayoutParams().topMargin = 0;
    getMarginLayoutParams().height = height;
    requestLayout();
    if ((mListener) != null) {
        mListener.onHeaderHeightChange(height);
    }
}