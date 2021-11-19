java.nio.file.attribute.PosixFileAttributes getPosixAttributes() throws java.io.IOException {
    return this.hdfs.getPosixFileAttributes(getResolved());
}