public void setDelayRate(int delayRate) {
    if ((this.delayRate) != delayRate) {
        org.kevoree.docker.containerDriver.core.cgroupDriver.NetworkDriver.setIncomingDelay(this.getBridge(), delayRate);
        this.delayRate = delayRate;
    }
}