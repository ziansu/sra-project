@java.lang.Override
public synchronized int read() throws java.io.IOException {
    return checkReadSoFarOrThrow(super.read());
}