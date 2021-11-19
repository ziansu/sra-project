@java.lang.Override
public void onCreate() {
    if (Configuration.IS_EINK_DEVICE) {
        setTheme(R.style.Theme_AppCompat_Light);
        if (!(net.zorgblub.typhon.Typhon.acraInitDone)) {
            org.acra.ACRA.init(this);
            net.zorgblub.typhon.Typhon.acraInitDone = true;
        }
    }
    super.onCreate();
    net.zorgblub.typhon.Typhon.instance = this;
}