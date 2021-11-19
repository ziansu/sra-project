public void setIncomingTraffic(int incomingTraffic) {
    org.kevoree.docker.containerDriver.core.cgroupDriver.NetworkDriver.setIncomingTraffic(this.getBridge(), incomingTraffic);
    this.incomingTraffic = incomingTraffic;
}