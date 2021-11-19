@java.lang.Override
public void unregister(com.dreameddeath.infrastructure.daemon.AbstractDaemon daemon) throws java.lang.Exception {
    if ((_currDaemonNode) != null) {
        _currDaemonNode.close();
    }
}