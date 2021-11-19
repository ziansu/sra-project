@org.junit.BeforeClass
public static void setupClass() throws java.lang.Exception {
    assumeFalse("Backup/Restore is currently buggy on Windows. Tracking the fix on SOLR-9242", Constants.WINDOWS);
    configureCluster(org.apache.solr.cloud.NUM_SHARDS).addConfig("conf1", TEST_PATH().resolve("configsets").resolve("cloud-minimal").resolve("conf")).configure();
}