@java.lang.Override
net.byteseek.io.reader.Window createWindow(final long windowStart) throws java.io.IOException {
    return new net.byteseek.io.reader.Window(bytes, 0, bytes.length);
}