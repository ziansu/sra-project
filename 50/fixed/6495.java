public void dropCollection(java.lang.String collectionName) {
    if (db.getCollectionNames().contains(collectionName)) {
        db.getCollection(collectionName).drop();
        mongoDBCollections.remove(collectionName);
    }
}