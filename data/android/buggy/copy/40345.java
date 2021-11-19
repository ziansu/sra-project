@java.lang.Override
public void onRequestSuccess(com.tapjoy.TJPlacement tjPlacement) {
    android.util.Log.d("Tapjoy", "onRequestSuccess");
    this.isReady = false;
    com.app.woney.fragment.EarnMainFragment.updateButtonLayout();
}