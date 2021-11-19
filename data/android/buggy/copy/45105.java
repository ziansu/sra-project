private synchronized int nextServerSlot() {
    return (++(serverIdx)) % (serverCache.size());
}