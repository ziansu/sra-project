@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.String... params) {
    edu.msu.perrym23.project2.Server server = new edu.msu.perrym23.project2.Server();
    boolean success = server.gameReady(params[0]);
    android.util.Log.i("success", "waiting");
    return success;
}