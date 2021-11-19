public java.sql.ResultSet getResultSet(java.lang.String sqlstatement) throws java.sql.SQLException {
    infs2605.assignment.DBController.openConnection();
    java.sql.Statement statement = infs2605.assignment.DBController.conn.createStatement();
    java.sql.ResultSet RS = statement.executeQuery(sqlstatement);
    java.lang.System.out.println(sqlstatement);
    return RS;
}