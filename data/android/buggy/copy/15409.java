@java.lang.Override
public void onUpdateListener(float interpolator) {
    mBitmapInfo.setCircleInterpolator(interpolator);
    mBitmapInfo.setMaskInterpolator(interpolator);
    mBitmapInfo.setStatus(BitmapInfo.PRE_DOWNLOAD);
    mBubbleTextView.setBitmapInfo(mBitmapInfo);
}