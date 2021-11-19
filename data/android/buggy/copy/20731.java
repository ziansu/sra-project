@java.lang.Override
protected void onStop() {
    super.onStop();
    int result;
    result = ResourceHostingTerminate();
    android.util.Log.d(TAG, ("ResourceHostingTerminate : " + result));
}