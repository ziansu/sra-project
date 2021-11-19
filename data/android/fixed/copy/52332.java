public static void triggerUpdate(android.content.Context context, int[] appWidgetId) {
    android.content.Intent intent = new android.content.Intent(context, me.anon.controller.provider.PlantWidgetProvider.class);
    intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
    intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, appWidgetId);
    context.sendBroadcast(intent);
}