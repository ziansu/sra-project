@java.lang.Override
public void onDestroy() {
    try {
        super.onDestroy();
        mapFragment.removeOnTouchListeners();
    } catch (java.lang.Exception e) {
        android.util.Log.e(com.platypii.baseline.MapActivity.TAG, "Exception in onDestroy", e);
    }
}