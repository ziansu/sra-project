public static int pingDatabase(java.sql.Connection conn) throws java.sql.SQLException {
    oracle.jdbc.OracleConnection oracleConn = com.alibaba.druid.util.OracleUtils.unwrap(conn);
    return oracleConn.pingDatabase();
}