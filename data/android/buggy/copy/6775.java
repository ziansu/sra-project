@org.junit.Test
public void testGetUniqueId() {
    org.junit.Assert.assertNotNull(com.google.gcloud.dns.testing.LocalDnsHelper.getUniqueId(com.google.common.collect.Lists.<com.google.gcloud.dns.testing.LocalDnsHelper.RrsetWrapper>newLinkedList()));
}