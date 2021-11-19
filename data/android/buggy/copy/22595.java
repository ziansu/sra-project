public void closeConnectionFactory() {
    try {
        instance.getCon().close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}