@java.lang.Override
public android.graphics.RectF getGridClippingRect() {
    mGridClippingRect.set(mViewPortHandler.getContentRect());
    mGridClippingRect.inset(0.0F, ((-(mAxis.getGridLineWidth())) / 2.0F));
    return mGridClippingRect;
}