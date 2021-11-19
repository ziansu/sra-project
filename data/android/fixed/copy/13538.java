public static float dpToPx(float dp, android.content.Context context) {
    android.content.res.Resources resources = context.getResources();
    android.util.DisplayMetrics metrics = resources.getDisplayMetrics();
    return dp * ((metrics.densityDpi) / 160.0F);
}