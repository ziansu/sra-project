public static net.michaelho.db.mongo.Query addToSet(java.lang.String field) {
    return new net.michaelho.db.mongo.Query("$addToSet", field);
}