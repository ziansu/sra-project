public static float getDensity(android.content.Context context) {
    context.getApplicationContext().getResources().getConfiguration().orientation = $missing$;
    return context.getApplicationContext().getResources().getDisplayMetrics().density;
}