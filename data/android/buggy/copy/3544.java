public void releaseConnection() {
    try {
        if ((connection) != null)
            connection.close();
        
    } catch (java.sql.SQLException e) {
    }
    for (io.lightlink.facades.SQLFacade childInstance : childInstances) {
        childInstance.releaseConnection();
    }
}