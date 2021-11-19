public java.util.List<com.flipkart.fdp.migration.distcp.core.MirrorDCMImpl.FileTuple> getInputPaths(java.lang.String path, java.util.Collection<java.lang.String> excludeList) throws java.lang.Exception {
    java.lang.String[] paths = path.split(",");
    return getInputPaths(java.util.Arrays.asList(paths), excludeList);
}