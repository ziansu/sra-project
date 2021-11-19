@java.lang.Override
public barqsoft.footballscores.widget.RemoteViewsFactory onGetViewFactory(final android.content.Intent intent) {
    return new barqsoft.footballscores.widget.WidgetFactory(this.getApplicationContext(), intent);
}