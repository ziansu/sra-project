@java.lang.Override
public long read(long fd, long buf, int len, long offset) {
    if (fail) {
        return -1;
    }
    return super.read(fd, buf, len, offset);
}