android.net.Uri insertHistoryItem(java.lang.String url, java.lang.String guid, java.lang.Long lastVisited, java.lang.Integer visitCount) throws android.os.RemoteException {
    return insertHistoryItem(url, guid, java.lang.System.currentTimeMillis(), null, null);
}