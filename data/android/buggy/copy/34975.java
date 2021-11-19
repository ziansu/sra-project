@java.lang.Override
public void onAppWidgetOptionsChanged(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId, android.os.Bundle newOptions) {
    super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
    android.util.Log.d("MainWidget", "onAppWidgetOptionsChanged");
    com.xwhiteknuckle.soundfx.WidgetHelper.changeWidgetToPlay(context);
}