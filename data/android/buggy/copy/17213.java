public void zoomTo(android.graphics.RectF dst) {
    if (mZoomAnimator.isRunning())
        mZoomAnimator.cancel();
    
    mStartRect.set(mImageArea);
    mEndRect.set(dst);
    mZoomAnimator.start();
}