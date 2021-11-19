@java.lang.Override
public int getStockAmount(java.lang.String stockName, java.lang.String transactionId) throws java.rmi.RemoteException {
    synchronized(lock) {
        if ((stocks.get(stockName)) != null) {
            return stocks.get(stockName).size();
        }
        return 0;
    }
}