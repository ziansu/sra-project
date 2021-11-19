public java.lang.String getFileIdAtIndex(java.lang.String collectionID, java.lang.Long index) {
    java.lang.String getSql = getFileIdAtIndexSql();
    return org.bitrepository.service.database.DatabaseUtils.selectFirstStringValue(dbConnector, getSql, collectionID, index);
}