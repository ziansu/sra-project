public void setOpponentZone(final org.copinf.cc.model.BoardZone zone) {
    this.opponentZone = zone;
    if (zone == null) {
        return ;
    }
    zone.opponentZone = this;
}