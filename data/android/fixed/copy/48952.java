public void setDrawable(android.graphics.drawable.Drawable drawable, io.doist.material.drawable.WrapperDrawable owner) {
    mDrawable = drawable;
    mDrawable.setCallback(owner);
    mChildChangingConfigurations = mDrawable.getChangingConfigurations();
}