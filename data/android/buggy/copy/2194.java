@java.lang.Override
public java.util.Collection<T> models() {
    java.util.Set<T> models = new java.util.HashSet<>();
    org.mongodb.morphia.query.QueryResults<T> results = io.minecloud.db.mongo.AbstractMongoRepository.find();
    models.addAll(results.asList());
    return models;
}