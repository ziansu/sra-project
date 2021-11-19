@java.lang.Override
public void onCreate() {
    super.onCreate();
    cn.bmob.v3.Bmob.initialize(this, "e96758cd72490954bf5abd6776e6e807");
    com.vipheyue.bigbusiness.utils.CrashHandler crashHandler = com.vipheyue.bigbusiness.utils.CrashHandler.getInstance();
    crashHandler.init(getApplicationContext());
    crashHandler.upCrashInfo(this);
}