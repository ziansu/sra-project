@org.junit.AfterClass
public static void stopServer() throws java.lang.Exception {
    org.openrdf.repository.http.HTTPStoreConnectionTest.server.stop();
}