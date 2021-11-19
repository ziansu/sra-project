public boolean shutdownAllConnectionInstances() {
    try {
        this.preparedStatements.shutdownAllPreparedStatements();
        this.dbConnection.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return false;
    }
    return true;
}