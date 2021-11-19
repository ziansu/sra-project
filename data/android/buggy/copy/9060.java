public static void connect() {
    if ((com.marklogic.client.test.Common.client) != null) {
        com.marklogic.client.test.Common.client.release();
        com.marklogic.client.test.Common.client = null;
    }
    com.marklogic.client.test.Common.client = com.marklogic.client.test.Common.newClient();
}