public static final long updateCollection(java.lang.String collection, java.lang.Object id, org.giiwa.core.bean.V v, boolean adding) {
    com.mongodb.BasicDBObject q = new com.mongodb.BasicDBObject().append(X.ID, id);
    return org.giiwa.core.bean.MongoHelper.updateCollection(collection, q, v);
}