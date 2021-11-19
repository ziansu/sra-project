@org.junit.AfterClass
public static void afterClass() throws java.lang.Exception {
    if ((org.apache.giraffa.TestGiraffaFS.grfs) != null)
        org.apache.giraffa.TestGiraffaFS.grfs.close();
    
    org.apache.giraffa.TestGiraffaFS.UTIL.shutdownMiniCluster();
}