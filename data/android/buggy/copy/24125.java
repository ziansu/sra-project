@java.lang.Override
@org.junit.After
public void tearDown() {
    connection.destroy();
    closeServerLocator(locator);
    stopComponent(server);
}