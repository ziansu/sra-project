public static boolean login(java.lang.String _username, java.lang.String _password) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    return MySQL.Login.checkPassword(_username, _password);
}