@org.junit.Test
public void testCreatePublicKey() throws java.lang.Exception {
    openstackKeyPairService.create("name", "publicKey");
    verify(openstackKeyPairClient).createWithPublicKey("name", "publicKey");
    verify(keyPairConverter).apply(keyPair);
}