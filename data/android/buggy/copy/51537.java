void disconnect() {
    this.connectedCnt.decrementAndGet();
    connectedCnt.notifyAll();
}