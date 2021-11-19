public void delete(apollo.server.Key k) throws apollo.server.DataStoreException, java.rmi.RemoteException {
    java.lang.String sql = ((("DELETE FROM " + (k.tableName)) + " WHERE _key='") + (k.id)) + "'";
    conn.exec(sql);
}