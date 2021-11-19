@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
    android.util.Log.e("CALL BACK", "invalidate");
    if ((getCallback()) != null) {
        getCallback().invalidateDrawable(this);
    }
}