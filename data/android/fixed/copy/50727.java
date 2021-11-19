@org.junit.Test
public void testConnection() throws java.sql.SQLException {
    java.sql.Connection connection = database.getConnection();
    connection.close();
}