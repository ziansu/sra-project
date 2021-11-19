@java.lang.Override
public void setButtonDrawable(android.graphics.drawable.Drawable d) {
    getPaddingDrawable().setWrappedDrawable(d);
    super.setButtonDrawable(getPaddingDrawable());
}