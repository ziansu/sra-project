@org.junit.Test
public void testCreate() throws java.lang.Exception {
    openstackKeyPairService.create("name");
    verify(openstackKeyPairClient).create("name");
    verify(keyPairConverter).apply(keyPair);
}