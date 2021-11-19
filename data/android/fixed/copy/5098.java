private com.mongodb.DBCollection getMLBParksCollection() {
    com.mongodb.DB db = dbConnection.getDB();
    dbConnection.checkDB();
    com.mongodb.DBCollection parkListCollection = db.getCollection("teams");
    return parkListCollection;
}