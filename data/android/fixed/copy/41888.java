public Node removeConnected() {
    if (!(this.connectedTo.isEmpty()))
        return this.connectedTo.remove(((this.connectedTo.size()) - 1));
    else
        return null;
    
}