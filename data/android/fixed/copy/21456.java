@java.lang.Override
public void onCreate() {
    com.merlin.network.NetworkMgr.getInstance().init(this, true);
    super.onCreate();
}