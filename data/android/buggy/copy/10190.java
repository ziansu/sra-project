@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable dr) {
    if (dr != null) {
        initMask(dr);
        swapBitmapMask(makeBitmapMask(dr));
        invalidate();
    }
}