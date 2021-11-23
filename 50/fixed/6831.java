public void commit() throws java.sql.SQLException {
    com.codefutures.tpcc.TpccStatements.logger.trace("COMMIT");
    conn.commit();
}