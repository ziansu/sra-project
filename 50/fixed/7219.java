public void setPenalty(boolean penalty) {
    if ((((sectorHistory) != null) && (!(this.penalty))) && penalty) {
        sectorHistory.penalty();
    }
    this.penalty = penalty;
}