public void manageScrollWithMyListeners(int scrollX, int position) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        setRealHorizontalScrollViewPosition(scrollX, mRealHorizontalScrollViewWidth, 0);
    }else {
        setRealHorizontalScrollViewPosition(scrollX, mRealHorizontalScrollViewWidth, position);
    }
}