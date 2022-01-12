public static void release() {
    if ((com.marklogic.client.test.Common.client) != null) {
        com.marklogic.client.test.Common.client.release();
        com.marklogic.client.test.Common.client = null;
    }
}