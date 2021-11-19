@java.lang.Override
public java.util.Collection selectALLCurrencyPair(java.lang.String secondaryCurrency) throws java.rmi.RemoteException {
    java.lang.String sql = ("  quoting_currency = '" + secondaryCurrency) + "'";
    return dbSQL.CurrencyPairSQL.selectCurrencyPair(sql, dsSQL.getConn());
}