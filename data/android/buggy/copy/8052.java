@java.lang.Override
public int read() throws java.io.IOException {
    return (seekToBeginPosition()) < (end) ? super.read() : -1;
}