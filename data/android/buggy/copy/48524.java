private void doTestWithPath(java.lang.String path) throws java.lang.Exception {
    java.lang.String storeName = "org.apache.kylin.storage.hdfs.HDFSResourceStore";
    org.apache.kylin.common.persistence.ResourceStoreTest.testAStore(storeName, org.apache.kylin.common.persistence.ResourceStoreTest.mockUrl("hdfs", kylinConfig), kylinConfig);
    junit.framework.TestCase.assertTrue(fs.exists(new org.apache.hadoop.fs.Path(path)));
}