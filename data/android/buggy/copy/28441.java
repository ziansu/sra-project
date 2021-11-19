public static java.sql.Connection getConnection() {
    if ((com.kpi.magazines.database.ConnectionManager.pool.size()) != 0) {
        return com.kpi.magazines.database.ConnectionManager.pool.poll();
    }
    synchronized(com.kpi.magazines.database.ConnectionManager.class) {
        return com.kpi.magazines.database.ConnectionManager.createConnection();
    }
}