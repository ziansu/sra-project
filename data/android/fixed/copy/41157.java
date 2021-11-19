@org.junit.BeforeClass
public static void beforeClass() throws java.lang.Exception {
    java.lang.System.setProperty(HBaseTestingUtility.BASE_TEST_DIRECTORY_KEY, GiraffaTestUtils.BASE_TEST_DIRECTORY);
    org.apache.giraffa.TestGiraffaFS.UTIL.startMiniCluster(1);
}