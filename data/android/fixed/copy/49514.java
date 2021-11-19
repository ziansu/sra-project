public synchronized java.util.List<it.scrs.miner.util.IP> getIPList() {
    synchronized(ipList) {
        return ipList;
    }
}