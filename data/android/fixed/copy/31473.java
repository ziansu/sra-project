public void saveGame() {
    if (this.match.isOngoing())
        throw new java.lang.IllegalStateException("Match is not over");
    
    this.resultLedger.registerResult(this.match);
}