public void recordDoubleFault() {
    this.totalDoubleFaults += 1;
    losePoint();
}