@org.junit.BeforeClass
public static void setupClass() throws java.lang.Exception {
    configureCluster(org.apache.solr.cloud.NUM_SHARDS).addConfig("conf1", TEST_PATH().resolve("configsets").resolve("cloud-minimal").resolve("conf")).configure();
}