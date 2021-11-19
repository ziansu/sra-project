public void setWheelItemCount(final int count) {
    mWheelItemCount = count;
    mWheelMiddleItemIndex = (mWheelItemCount) / 2;
    mSelectorIndices = new int[mWheelItemCount];
}