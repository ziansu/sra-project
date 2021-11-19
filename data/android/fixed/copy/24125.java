@java.lang.Override
@org.junit.After
public void tearDown() throws java.lang.Exception {
    connection.destroy();
    closeServerLocator(locator);
    stopComponent(server);
    super.tearDown();
}