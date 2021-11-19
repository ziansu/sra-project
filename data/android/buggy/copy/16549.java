protected boolean shouldRequestLayout() {
    return (mOnLayoutCount) < (getChildCount());
}