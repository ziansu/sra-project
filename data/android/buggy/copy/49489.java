@java.lang.Override
public barqsoft.footballscores.widget.RemoteViewsFactory onGetViewFactory(final android.content.Intent intent) {
    android.util.Log.e("RemoteService", "onGetViewFactory");
    return new barqsoft.footballscores.widget.WidgetFactory(this.getApplicationContext(), intent);
}