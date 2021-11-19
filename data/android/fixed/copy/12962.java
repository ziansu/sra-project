@com.couchbase.lite.internal.InterfaceAudience.Public
public java.util.Map<java.lang.String, java.lang.Object> getUserProperties() {
    return (getCurrentRevision()) == null ? null : getCurrentRevision().getUserProperties();
}