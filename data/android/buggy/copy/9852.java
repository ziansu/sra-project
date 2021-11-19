public void setUp() throws java.lang.Exception {
    java.lang.System.setProperty("hadoop.home.dir", "D:\\Program Files\\Java\\jdk1.7.0_80");
    java.lang.System.setProperty("HADOOP_USER_NAME", "hdfs");
    hive = org.apache.hadoop.hive.ql.metadata.Hive.get();
    checker = new org.apache.hadoop.hive.ql.metadata.HiveMetaStoreChecker(hive);
}