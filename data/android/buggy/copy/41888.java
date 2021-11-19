public Node removeConnected() {
    return this.connectedTo.remove(((this.connectedTo.size()) - 1));
}