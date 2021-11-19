@java.lang.Override
public de.mickare.xserver.net.XServerObj getServer(java.lang.String servername) {
    try (de.mickare.xserver.util.concurrent.CloseableLock cs = serversLock.readLock().open()) {
        return servers.get(servername);
    }
}