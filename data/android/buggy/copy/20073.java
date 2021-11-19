@java.lang.Override
public java.nio.file.Path toRealPath(java.nio.file.LinkOption... options) throws java.io.IOException {
    hdfs.jsr203.HadoopPath realPath = new hdfs.jsr203.HadoopPath(this.hdfs, getResolvedPath()).toAbsolutePath();
    realPath.checkAccess();
    return realPath;
}