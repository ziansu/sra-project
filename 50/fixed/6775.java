@org.junit.Test
public void testGetUniqueId() {
    org.junit.Assert.assertNotNull(com.google.gcloud.dns.testing.LocalDnsHelper.getUniqueId(new java.util.HashSet<java.lang.String>()));
}