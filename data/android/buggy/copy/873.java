@java.lang.Override
public java.util.List<Model.HistoryEntry> getTransactionHistory(java.lang.String transactionId) throws java.rmi.RemoteException {
    return new java.util.ArrayList(historyEntries);
}