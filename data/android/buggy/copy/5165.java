@java.lang.Override
public java.util.Collection getALLLecontacts() throws java.rmi.RemoteException {
    return dbSQL.LeContactsSql.selectALL(dsSQL.getConn());
}