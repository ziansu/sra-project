@java.lang.Override
public void finish() {
    ds.framework.v4.io.ConnectionChecker.getInstance().unregisterReceiver(this);
    ds.framework.v4.Global.onActivityDestroyed(this);
    super.finish();
}