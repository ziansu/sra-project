public java.util.Collection getCollectionByName(java.lang.String name) throws java.sql.SQLException {
    java.util.Collection[] collections = getCollections();
    for (java.util.Collection collection : collections) {
        if (collection.getMetadata("name").equals(name))
            return collection;
        
    }
    return null;
}