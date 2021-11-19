public void close() throws java.io.IOException {
    mFileChannel.force(true);
    mFileChannel.close();
}