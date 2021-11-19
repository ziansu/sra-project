private void onSizeChange() {
    float pos = ((mMoveDistance) / ((mRulerSpaceSize) + (mRulerLineWidth))) / 10;
    mOnSizeChangeListener.onSizeChange(((mDataFormat.format(pos)) + ""));
}