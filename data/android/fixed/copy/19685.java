public static void closeAllConnections(java.sql.Connection dbConnection, java.sql.ResultSet rs1, java.sql.ResultSet rs2, java.sql.PreparedStatement... prepStmts) {
    org.wso2.carbon.user.core.util.DatabaseUtil.closeResultSet(rs1);
    org.wso2.carbon.user.core.util.DatabaseUtil.closeResultSet(rs2);
    org.wso2.carbon.user.core.util.DatabaseUtil.closeStatements(prepStmts);
    org.wso2.carbon.user.core.util.DatabaseUtil.closeConnection(dbConnection);
}