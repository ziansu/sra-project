public boolean userExists(java.lang.String username) {
    try {
        if (userDAO.userExists(username)) {
            return true;
        }
    } catch (exceptions.DatabaseException | java.sql.SQLException e) {
        e.printStackTrace();
    }
    return false;
}