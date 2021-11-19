@com.couchbase.lite.internal.InterfaceAudience.Public
public boolean delete() throws com.couchbase.lite.CouchbaseLiteException {
    return (getCurrentRevision()) == null ? false : (getCurrentRevision().deleteDocument()) != null;
}