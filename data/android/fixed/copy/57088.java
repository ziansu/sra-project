@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.String... params) {
    boolean success = server.gameReady(params[0]);
    android.util.Log.i("success", "waiting");
    return success;
}