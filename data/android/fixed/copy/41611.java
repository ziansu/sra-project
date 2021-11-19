@org.junit.Test
public void readSimpleGraphTest() {
    org.s1ck.gdl.GDLLoader loader = getLoaderFromGDLString("[()]");
    validateCollectionSizes(loader, 1, 1, 0);
    validateCacheSizes(loader, 0, 0, 0);
}