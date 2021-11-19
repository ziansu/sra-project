public void setPenalty(boolean penalty) {
    if ((((sectorHistory) != null) && (!(this.penalty))) && penalty) {
        sectorHistory.penalty(true);
    }
    this.penalty = penalty;
}