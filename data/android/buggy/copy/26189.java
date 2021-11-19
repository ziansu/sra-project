@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    network.afterSend(response);
    super.onPostExecute(result);
}