@org.junit.AfterClass
public static void stopServer() throws java.lang.Exception {
    try {
    } finally {
        org.openrdf.repository.http.HTTPStoreConnectionTest.server.stop();
    }
}