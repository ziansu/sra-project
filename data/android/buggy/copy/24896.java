@org.junit.Test
public void makeTest() throws java.lang.Exception {
    performTest(hashMapFactory.synchronizeed());
    performTest(hashMapFactory.globalLock());
    performTest(hashMapFactory.fineGrained());
}