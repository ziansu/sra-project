@java.lang.Override
protected void onPreExecute() {
    if ((searchTaskCallbacks) != null) {
        searchTaskCallbacks.onPreExecute();
    }
}