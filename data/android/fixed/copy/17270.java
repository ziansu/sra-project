@java.lang.Override
protected void onPostExecute(java.lang.Exception ex) {
    super.onPostExecute(ex);
    if (com.spjanson.restdemo.REST.mConnected) {
        com.spjanson.restdemo.REST.mConnCBs.onConnOK();
    }else {
        com.spjanson.restdemo.REST.mConnCBs.onConnFail(ex);
    }
}