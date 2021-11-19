@java.lang.Override
public beans.CurrencyPair updateCurrencyPair(beans.CurrencyPair cp) throws java.rmi.RemoteException {
    return dbSQL.CurrencyPairSQL.update(cp, dsSQL.getConn());
}