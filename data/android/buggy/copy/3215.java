@java.lang.Override
public int saveLeContacts(beans.LeContacts le) throws java.rmi.RemoteException {
    return dbSQL.LeContactsSql.save(le, dsSQL.getConn());
}