@java.lang.Override
protected void onPostExecute(com.gamble.unopp.connection.response.Response s) {
    super.onPostExecute(s);
    if ((this.callback) != null) {
        callback.requestFinished(s);
    }
}