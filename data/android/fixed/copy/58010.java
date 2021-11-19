@org.junit.Test
public void testDownloadOpenmrsIds() throws java.sql.SQLException {
    org.opensrp.domain.Client client = this.createClient("12345", "First", "Last", "Male", "454/16");
    openmrsIDService.assignOpenmrsIdToClient("12345-1", client);
    org.junit.Assert.assertNotNull(client.getIdentifier(OpenmrsIDService.ZEIR_IDENTIFIER));
}