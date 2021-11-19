@java.lang.Override
public void onError(java.lang.Throwable t) {
    android.util.Log.i(org.almende.proheal.MainActivity.TAG, "error: ", t);
    onConnectionError();
}