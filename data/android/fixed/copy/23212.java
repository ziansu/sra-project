@com.couchbase.lite.internal.InterfaceAudience.Public
public java.util.List<com.couchbase.lite.SavedRevision> getRevisionHistory() throws com.couchbase.lite.CouchbaseLiteException {
    return (getCurrentRevision()) == null ? null : getCurrentRevision().getRevisionHistory();
}