@java.lang.Override
public void onDestroy() {
    stop();
    org.md2k.utilities.Report.Log.d(org.md2k.datakit.ServiceDataKit.TAG, "onDestroy()");
    super.onDestroy();
}