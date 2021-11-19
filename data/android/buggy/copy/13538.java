public static float dpToPx(float dp, android.content.Context context) {
    android.content.res.Resources resources = context.getResources();
    android.util.DisplayMetrics metrics = resources.getDisplayMetrics();
    float px = dp * ((metrics.densityDpi) / 160.0F);
    return px;
}