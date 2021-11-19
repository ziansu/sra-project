void unsubscribe(java.lang.String userID) throws java.sql.SQLException {
    servlets.DatabaseHandler.deleteSubscription(this, userID);
}