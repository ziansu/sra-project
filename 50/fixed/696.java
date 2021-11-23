public com.cybermkd.kit.MongoQuery byId(java.lang.String id) {
    query.add(new org.bson.Document("_id", new org.bson.types.ObjectId(id)));
    return this;
}