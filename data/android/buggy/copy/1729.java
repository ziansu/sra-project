public boolean execute(java.lang.String query) throws java.sql.SQLException {
    java.sql.Statement st = connection.createStatement();
    return st.execute(query);
}