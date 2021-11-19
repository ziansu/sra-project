@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.d(TAG, "onStart - start");
    linLayout.removeAllViews();
    createInterface();
    android.util.Log.d(TAG, "onStart - finish");
}