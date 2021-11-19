public boolean newSession(java.lang.String username, java.lang.String sessionId) {
    try {
        this.update(java.lang.String.format(("INSERT INTO sessions VALUES ('%s', '%s');" + username), sessionId));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return false;
    }
    return true;
}