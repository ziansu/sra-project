@org.junit.Test
public void testConnection() throws java.sql.SQLException {
    java.sql.Connection connection = database.getConnection();
    java.lang.System.out.println(database.dataSource.getUrl());
    connection.close();
}