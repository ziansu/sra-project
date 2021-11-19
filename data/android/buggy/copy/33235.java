@java.lang.Override
protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
    if ((super.verifyDrawable(drawable)) || (drawable == (this.mMarginDrawable))) {
        return true;
    }
    return false;
}