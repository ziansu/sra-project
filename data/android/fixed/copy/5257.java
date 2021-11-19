public static int dp2px(android.content.Context context, int dp) {
    float scale = context.getResources().getDisplayMetrics().density;
    return ((int) ((dp * scale) + 0.5F));
}