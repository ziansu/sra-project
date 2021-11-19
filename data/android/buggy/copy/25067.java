@java.lang.Override
public de.mickare.xserver.net.XServerObj getXServer(java.lang.String name) {
    try (de.mickare.xserver.util.concurrent.CloseableLock cs = serversLock.readLock().open()) {
        return servers.get(name);
    }
}