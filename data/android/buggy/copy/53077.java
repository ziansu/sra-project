public void changeProtocol(byte protocol) {
    this.currentProtocol = protocol;
    resetAPDU(shortAPDU, null);
    resetAPDU(extendedAPDU, null);
}