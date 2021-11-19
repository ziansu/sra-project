@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testConstructorWithByteArrayAlgorithmNull1() {
    gq.baijie.catalog.entity.Hash hash = new gq.baijie.catalog.entity.Hash(null, Hash.Algorithm.MD5);
}