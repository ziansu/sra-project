public java.lang.String electTrader(int id) {
    if ((!(this.isTrader)) && (id < (this.getPeerId()))) {
        this.startElection();
        return "OK";
    }
    return null;
}