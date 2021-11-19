public void setOnItemViewClickedListener(android.support.v17.leanback.widget.OnItemViewClickedListener listener) {
    mOnItemViewClickedListener = listener;
    if (mViewsCreated) {
        throw new java.lang.IllegalStateException("Item clicked listener must be set before views are created");
    }
}