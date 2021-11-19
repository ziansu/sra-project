private int calculateMeasuredHeight() {
    mRawHeight = getMeasuredHeight();
    return (mRawHeight) + (calculateShadowHeight());
}