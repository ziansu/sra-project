@java.lang.Override
public int read() throws java.io.IOException {
    return (seekToBeginPosition()) < (end) ? source.read() : -1;
}