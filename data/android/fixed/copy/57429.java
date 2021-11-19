public void loadAllWires() {
    for (datastructures.ComponentConnections c : allConnections) {
        loadWire(c);
    }
}