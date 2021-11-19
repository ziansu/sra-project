public void refreshFreeCommPorts() throws com.infiniteautomation.mango.io.serial.SerialPortConfigException {
    this.lock.writeLock().lock();
    try {
        freePorts.clear();
        initialize(false);
    } finally {
        this.lock.writeLock().unlock();
    }
}