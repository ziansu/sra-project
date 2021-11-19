public void commit() throws java.sql.SQLException {
    java.sql.Connection con = com.foresee.common.util.DBUtils.getConnection();
    con.commit();
}