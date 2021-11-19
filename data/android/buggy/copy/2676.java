public com.mongodb.client.FindIterable<org.bson.Document> findWithProjection(java.lang.String collectionName, java.lang.String projectName) {
    return db.getCollection(collectionName).find().projection(new com.mongodb.BasicDBObject(projectName, true).append("_id", true)).limit(10);
}