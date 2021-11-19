public void setRemotePort(int remotePort) {
    if ((this.remotePort) != 0) {
        throw new java.lang.IllegalStateException(("remotePort already set to :" + (this.remotePort)));
    }
    this.remotePort = remotePort;
}