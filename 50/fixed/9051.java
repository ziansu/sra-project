public com.khillynn.DB getDatabase() {
    if ((database) == null) {
        database = getMongo().getDB(MongoDBD.database);
    }
    return database;
}