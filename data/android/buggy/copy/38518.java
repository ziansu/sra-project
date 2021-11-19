@com.couchbase.lite.internal.InterfaceAudience.Public
public java.util.Map<java.lang.String, java.lang.Object> getProperties() {
    com.couchbase.lite.SavedRevision currentRevision = getCurrentRevision();
    return currentRevision == null ? null : currentRevision.getProperties();
}