@java.lang.Override
public void run() {
    try {
        sqliteConnection.createStatement().execute(command);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}