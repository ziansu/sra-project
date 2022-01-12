public void setUp() throws java.lang.Exception {
    java.lang.System.setProperty("HADOOP_USER_NAME", "hdfs");
    hive = org.apache.hadoop.hive.ql.metadata.Hive.get();
    checker = new org.apache.hadoop.hive.ql.metadata.HiveMetaStoreChecker(hive);
}