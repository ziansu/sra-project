@java.lang.Override
public void onAppWidgetOptionsChanged(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId, android.os.Bundle newOptions) {
    context.startService(new android.content.Intent(context, kamini.app.moviecollection.widget.MovieWidgetIntentService.class));
}