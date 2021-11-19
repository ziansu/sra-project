public void newRound(int quota) {
    this.currentCardQuota = quota;
    gateway.write(("1:" + quota));
}