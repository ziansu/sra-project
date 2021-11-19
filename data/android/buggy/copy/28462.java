public static int getPixelsFromDps(int dps, android.content.Context context) {
    final float scale = context.getResources().getDisplayMetrics().density;
    int pixels = ((int) ((dps * scale) + 0.5F));
    return pixels;
}