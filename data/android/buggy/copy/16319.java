@java.lang.Override
protected void tearDown() throws java.lang.Exception {
    if ((connection) != null) {
        connection.close();
        connection = null;
    }
}