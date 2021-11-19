public com.datafibers.util.MongoAdminClient useCollection(java.lang.String colName) {
    if (collectionExists(colName))
        this.collection = this.database.getCollection(colName);
    
    return this;
}