public void truncate() throws java.sql.SQLException {
    java.sql.Connection conn = com.adintellig.ella.util.JdbcUtil.getConnection();
    java.sql.Statement stmt = conn.createStatement();
    stmt.executeUpdate("truncate table hbase.servers");
    com.adintellig.ella.util.JdbcUtil.close(conn, stmt, null);
}