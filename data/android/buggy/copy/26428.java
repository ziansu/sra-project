@java.lang.Override
protected void onPostExecute(java.lang.Boolean isConnected) {
    super.onPostExecute(isConnected);
    if ((!isConnected) && ((listener) != null)) {
        listener.onNetworkConnectionFailed();
    }
}