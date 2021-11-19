@java.lang.Override
public boolean connect() {
    try {
        connection = java.sql.DriverManager.getConnection(url);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return false;
    } finally {
        close();
    }
    return true;
}