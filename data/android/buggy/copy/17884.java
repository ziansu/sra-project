static org.apache.hadoop.fs.FileSystem fsForPath(org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.fs.Path path) {
    try {
        return path.getFileSystem(conf);
    } catch (java.io.IOException ex) {
        throw new org.kitesdk.data.DatasetIOException(("Cannot access FileSystem for uri:" + path), ex);
    }
}