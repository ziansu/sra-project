@org.junit.Test
public void testMultiThreadedUsage() throws java.sql.SQLException {
    runMultiThreadUsage("testCommunicationModel", 100, 100);
}