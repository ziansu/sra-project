private int dpToPx(float dp) {
    android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
    float px = android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics);
    return java.lang.Math.round(px);
}