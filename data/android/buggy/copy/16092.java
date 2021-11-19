public boolean updateDocument(com.couchbase.lite.Document currentDocument, java.lang.Object object) {
    return updateDocument(currentDocument, objectMapper.convertValue(object, java.util.Map.class));
}