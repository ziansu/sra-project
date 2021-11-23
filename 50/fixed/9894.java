@java.lang.Override
public void close() {
    if ((port) != null) {
        port.close();
        port = null;
    }
}