public void incHops(int index, boolean first) {
    if (first)
        protocol.Protocol.hops.add(index, 1);
    else {
        int tmp = protocol.Protocol.hops.get(index);
        protocol.Protocol.hops.set(index, (++tmp));
    }
}