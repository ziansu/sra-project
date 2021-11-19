@java.lang.Override
protected void attachBaseContext(android.content.Context base) {
    super.attachBaseContext(base);
    android.support.multidex.MultiDex.install(base);
    com.tencent.bugly.beta.Beta.installTinker();
}