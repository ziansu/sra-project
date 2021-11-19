@java.lang.Override
public void requestSuggestions(com.google.gerrit.client.ui.Request req, com.google.gerrit.client.ui.Callback cb) {
    com.google.gerrit.client.ui.RemoteSuggestOracle.Query q = new com.google.gerrit.client.ui.RemoteSuggestOracle.Query(req, cb);
    if ((query) == null) {
        q.start();
    }
    query = q;
}