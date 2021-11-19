private void closeConnection(java.sql.Connection connection) {
    try {
        if (connection != null) {
            connection.close();
        }
    } catch (java.sql.SQLException e) {
        persistence.JdbcTemplate.LOGGER.error(("Can't close connection: " + e));
    }
}