@org.junit.Test
public void testGetSharkCertificateTrustLevelWithPeerSi() throws java.lang.Exception {
    net.sharkfw.security.pki.SharkCertificate sharkCertificate = sharkPkiStorage.getSharkCertificate(alice, bob);
    org.junit.Assert.assertEquals(this.sharkCertificate.getTrustLevel(), sharkCertificate.getTrustLevel());
}