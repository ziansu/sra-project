@java.lang.Override
public int available() throws java.io.IOException {
    poll(0);
    return readableBytes();
}