@java.lang.Override
public boolean connect() {
    commError = 0;
    comm.open();
    return proxy.open();
}