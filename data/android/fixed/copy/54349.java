public boolean connectDB(java.lang.String URL, java.lang.String username, java.lang.String password) {
    try {
        connection = java.sql.DriverManager.getConnection(URL, username, password);
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}