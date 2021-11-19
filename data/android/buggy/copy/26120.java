private java.lang.String getIndexPath(com.orientechnologies.orient.core.storage.impl.local.paginated.OLocalPaginatedStorage storageLocalAbstract) {
    return ((((storageLocalAbstract.getStoragePath()) + (java.io.File.separator)) + (com.orientechnologies.lucene.manager.OLuceneIndexManagerAbstract.OLUCENE_BASE_DIR)) + (java.io.File.separator)) + (indexName);
}