@com.couchbase.lite.internal.InterfaceAudience.Public
public java.util.List<com.couchbase.lite.SavedRevision> getRevisionHistory() throws com.couchbase.lite.CouchbaseLiteException {
    if ((getCurrentRevision()) == null) {
        com.couchbase.lite.util.Log.w(Database.TAG, "getRevisionHistory() called but no currentRevision");
        return null;
    }
    return getCurrentRevision().getRevisionHistory();
}