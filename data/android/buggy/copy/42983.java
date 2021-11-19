@java.lang.Override
public com.ivanmagda.habito.widget.RemoteViewsFactory onGetViewFactory(android.content.Intent intent) {
    int appWidgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);
    return new com.ivanmagda.habito.widget.ListProvider(this, intent);
}