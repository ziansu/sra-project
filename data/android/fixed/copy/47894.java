static android.graphics.drawable.Drawable setDrawableColor(android.graphics.drawable.Drawable icon, int color) {
    if (icon == null) {
        return null;
    }
    icon.setColorFilter(new android.graphics.PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP));
    return icon;
}