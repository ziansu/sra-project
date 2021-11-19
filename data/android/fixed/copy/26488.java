@java.lang.Override
protected void createDelegateConnection() throws java.io.IOException {
    setDelegate(com.oracle.truffle.r.runtime.conn.FileConnections.createDelegateConnection(this, cType, false));
}