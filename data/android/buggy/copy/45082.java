@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    android.os.Debug.waitForDebugger();
    try {
        cursor = dbManager.getAllBusinesses();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}