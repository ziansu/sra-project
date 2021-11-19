public static com.mongodb.DB createDbMock() {
    com.mongodb.DB db = org.mockito.Mockito.mock(com.mongodb.DB.class);
    org.mockito.Mockito.when(db.isAuthenticated()).thenReturn(true);
    com.bill.rss.mongodb.MongoDBConnection.setDbConnection(db);
    return db;
}