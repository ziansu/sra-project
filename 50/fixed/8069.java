public void destruct() throws java.sql.SQLException {
    for (java.sql.Connection c : connections) {
        c.commit();
        c.close();
    }
}