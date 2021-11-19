public void incHops(int index) {
    int tmp = protocol.Protocol.hops.get(index);
    protocol.Protocol.hops.set(index, (++tmp));
}