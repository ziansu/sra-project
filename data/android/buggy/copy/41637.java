@java.lang.Override
public void onCreate() {
    super.onCreate();
    ning.xyw.androidmanager.App.mContext = this;
    ning.xyw.androidmanager.service.FloatViewService.startService();
}