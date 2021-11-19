@java.lang.Override
public int read() throws java.io.IOException {
    int ret = javax.mini.io.File.read0(fileHandle);
    if (ret < 0) {
        throw new java.io.IOException(("read file error: " + (path)));
    }
    return ret;
}