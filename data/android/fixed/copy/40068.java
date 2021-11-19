public android.graphics.RectF getGridClippingRect() {
    mGridClippingRect.set(mViewPortHandler.getContentRect());
    mGridClippingRect.inset((-(mAxis.getGridLineWidth())), 0.0F);
    return mGridClippingRect;
}