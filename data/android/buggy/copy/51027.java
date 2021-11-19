@java.lang.Override
public synchronized void startScanImpl() {
    if ((mState) != (org.physical_web.physicalweb.MdnsPwoDiscoverer.State.STOPPED)) {
        return ;
    }
    mNsdManager.discoverServices(org.physical_web.physicalweb.MdnsPwoDiscoverer.MDNS_SERVICE_TYPE, NsdManager.PROTOCOL_DNS_SD, mDiscoveryListener);
    mState = org.physical_web.physicalweb.MdnsPwoDiscoverer.State.WAITING;
}