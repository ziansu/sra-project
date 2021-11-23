@org.junit.Test
public void testConnect() {
    java.sql.Connection connection = null;
    try {
        connection = getConnection();
        assert connection != null;
    } catch (final java.lang.Exception e) {
        org.junit.Assert.fail(e.getMessage());
    }
}