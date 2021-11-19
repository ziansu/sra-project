public void setPeer(Sim.SimEnt peer) {
    _peer = peer;
    if ((_peer) instanceof Sim.Link) {
        ((Sim.Link) (_peer)).setConnector(this);
    }
}