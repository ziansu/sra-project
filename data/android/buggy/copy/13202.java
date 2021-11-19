@java.lang.Override
public void onDestroy() {
    android.util.Log.v("Flathead", "[Flow] Java - onDestroy");
    com.flathead.MYFWPackage.MYFWActivity.NativeOnDestroy();
    if (m_ShowAds) {
    }
    super.onDestroy();
    m_IAPManager.Shutdown();
}