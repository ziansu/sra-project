public static void main(java.lang.String[] args) throws java.sql.SQLException {
    java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:h2:./main");
    org.h2.tools.Server.createWebServer().start();
    java.sql.Statement stmt = conn.createStatement();
    stmt.execute("CREATE TABLE id IDENTITY, username VARCHAR, address VARCHAR, email VARCHAR");
}