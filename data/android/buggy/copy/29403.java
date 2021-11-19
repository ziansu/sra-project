public final void setPeekHeight(int peekHeight) {
    mPeekHeight = java.lang.Math.max(0, peekHeight);
    mMaxOffset = (mParentHeight) - peekHeight;
}