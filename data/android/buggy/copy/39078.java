private java.util.Map<java.lang.String, org.apache.hadoop.fs.Path> getSortedWALogs() throws java.io.IOException {
    return getSortedWALogs(org.apache.accumulo.server.ServerConstants.getRecoveryDirs());
}