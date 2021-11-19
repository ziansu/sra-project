@java.lang.Override
@java.lang.Deprecated
public void setBackgroundDrawable(android.graphics.drawable.Drawable background) {
    mBackgroundDrawable = background;
    updateBackgroundDrawableAttrs(true);
    if ((BuildConfig.VERSION_CODE) >= (Build.VERSION_CODES.JELLY_BEAN))
        super.setBackground(mBackgroundDrawable);
    else
        super.setBackgroundDrawable(mBackgroundDrawable);
    
}