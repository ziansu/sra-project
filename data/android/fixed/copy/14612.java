public void StartWifi() {
    mBound = true;
    new pt.ulisboa.tecnico.cmov.ubibike.WifiDirect.MsgSenderActivity.IncommingCommTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    guiUpdateDisconnectedState();
}