@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    edu.hm.cs.fs.app.App.getAppComponent(context).inject(this);
    super.onReceive(context, intent);
}