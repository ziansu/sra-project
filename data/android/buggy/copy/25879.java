@java.lang.Override
public boolean deleteLeContacts(beans.LeContacts le) throws java.rmi.RemoteException {
    return dbSQL.LeContactsSql.delete(le, dsSQL.getConn());
}