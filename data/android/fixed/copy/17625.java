@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.i("onResume", category);
    setUserVisibleHint(true);
}