@java.lang.Override
public java.nio.channels.FileChannel getFileChannel() throws java.io.IOException {
    tryOpen();
    return randomAccessFile.get().getChannel();
}