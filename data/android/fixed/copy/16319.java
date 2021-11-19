@org.junit.After
public void tearDown() throws java.lang.Exception {
    if ((connection) != null) {
        connection.close();
        connection = null;
    }
}