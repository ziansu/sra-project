public static java.lang.String buildMongoUrl(org.codinjutsu.tools.mongo.ServerConfiguration serverConfiguration, org.codinjutsu.tools.mongo.model.MongoDatabase database) {
    return java.lang.String.format("%s/%s", serverConfiguration.getServerUrls().get(0), (database == null ? "test" : database.getName()));
}