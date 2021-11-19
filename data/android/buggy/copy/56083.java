public java.sql.Connection getConnection() {
    try (com.jolbox.bonecp.BoneCP connectionPool = getConnectionPool();java.sql.Connection conn = connectionPool.getConnection()) {
        return conn;
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return null;
}