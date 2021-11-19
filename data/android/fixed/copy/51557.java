@org.junit.Test
public void testGetSharkCertificateTrustLevelWithPeerSi() throws java.lang.Exception {
    net.sharkfw.security.pki.SharkCertificate sharkCertificate = sharkPkiStorage.getSharkCertificate(bob, alice);
    org.junit.Assert.assertEquals(this.sharkCertificate.getTrustLevel(), sharkCertificate.getTrustLevel());
}