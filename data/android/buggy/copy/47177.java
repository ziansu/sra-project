public void setDrawable(android.graphics.drawable.Drawable drawable) {
    if (drawable == null) {
        mIsFailed = true;
        return ;
    }
    mDrawable = drawable;
    setBounds(mDrawable.getBounds());
}