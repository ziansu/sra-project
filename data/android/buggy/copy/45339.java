@java.lang.Override
public void onCreate() {
    super.onCreate();
    io.innofang.autosms.App.sInstance = this;
    io.innofang.autosms.utils.CrashHandler.getInstance().init(this);
}