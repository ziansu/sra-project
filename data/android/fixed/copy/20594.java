@org.junit.Test
public void readFragmentedGraphTest() {
    org.s1ck.gdl.GDLLoader loader = getLoaderFromGDLString("g[()],g[()]");
    validateCollectionSizes(loader, 1, 2, 0);
    validateCacheSizes(loader, 1, 0, 0);
}