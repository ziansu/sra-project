public static com.mongodb.DB getDbConnection() {
    if (((com.bill.rss.mongodb.MongoDBConnection.dbConnection) != null) && (com.bill.rss.mongodb.MongoDBConnection.dbConnection.isAuthenticated())) {
        return com.bill.rss.mongodb.MongoDBConnection.dbConnection;
    }
    return com.bill.rss.mongodb.MongoDBConnection.createNewDbConnection();
}