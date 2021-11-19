public void notifyTxCommitted() {
    org.elasql.cache.calvin.CalvinPostOffice postOffice = ((org.elasql.cache.calvin.CalvinPostOffice) (org.elasql.server.Elasql.remoteRecReceiver()));
    postOffice.notifyTxCommitted(tx.getTransactionNumber());
}