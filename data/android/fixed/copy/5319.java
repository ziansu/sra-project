@org.junit.Test
public void testGetLastPublishedVersionsPublicationStatus() {
    org.gbif.ipt.model.Resource r = getResource();
    assertEquals(PublicationStatus.PRIVATE, r.getLastPublishedVersionsPublicationStatus());
}