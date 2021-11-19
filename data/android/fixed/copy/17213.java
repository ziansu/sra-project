public void zoomTo(android.graphics.RectF dst) {
    mZoomAnimator.cancel();
    mStartRect.set(mImageArea);
    mEndRect.set(dst);
    mZoomAnimator.start();
}