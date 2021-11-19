@org.testng.annotations.BeforeClass
public void setUp() throws java.lang.Exception {
    com.linkedin.pinot.integration.tests.DefaultColumnsClusterIntegrationTest.LOGGER.info("Set up cluster with new schema.");
    setUp(true);
}