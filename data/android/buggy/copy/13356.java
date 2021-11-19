protected org.apache.hadoop.fs.FileSystem getFileSystem(org.apache.hadoop.conf.Configuration conf) throws java.io.IOException {
    java.lang.String username = org.apache.hadoop.security.UserGroupInformation.getCurrentUser().getUserName();
    org.apache.hadoop.yarn.server.nodemanager.containermanager.logaggregation.LogAggregationService.LOG.error(("<Dino> Current username is: " + username));
    return org.apache.hadoop.fs.FileSystem.get(conf);
}