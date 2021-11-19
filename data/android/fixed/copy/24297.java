@org.junit.Test
public void testClientGetTimeout() throws java.io.IOException {
    org.apache.hadoop.conf.Configuration config = new org.apache.hadoop.conf.Configuration();
    assertEquals(org.apache.hadoop.ipc.Client.getTimeout(config), (-1));
}