@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testConstructorWithByteArrayAlgorithmNull2() {
    gq.baijie.catalog.entity.Hash hash = new gq.baijie.catalog.entity.Hash(gq.baijie.catalog.util.HEX.hexToBytes(gq.baijie.catalog.entity.HashTest.MD5_HEX), null);
}