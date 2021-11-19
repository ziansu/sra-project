public void stopPeriodicScan() {
    enforceMainThread();
    m_config.autoScanActiveTime = com.idevicesinc.sweetblue.utils.Interval.DISABLED;
    if (false == (m_doingInfiniteScan)) {
        this.stopScan();
    }
}