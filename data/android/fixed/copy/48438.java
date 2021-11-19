public void rollback() throws java.sql.SQLException {
    com.codefutures.tpcc.TpccStatements.logger.trace("ROLLBACK");
    conn.rollback();
}