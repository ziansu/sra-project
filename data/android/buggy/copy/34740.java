@org.junit.AfterClass
public static void cleanUp() throws java.lang.Exception {
    org.smartdata.integration.IntegrationTestBase.smartServer.cleanUp();
    org.smartdata.integration.IntegrationTestBase.cluster.cleanUp();
}