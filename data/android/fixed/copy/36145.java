private android.graphics.drawable.Drawable getColoredBackground(int color) {
    android.graphics.drawable.Drawable circle = getResources().getDrawable(R.drawable.circle);
    circle.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
    return circle;
}