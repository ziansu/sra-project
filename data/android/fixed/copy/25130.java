public void recordHit() {
    if (!(this.isDuelling())) {
        this.notifyDuelObservers();
    }
    this.switchPlayerUpNext();
    this.throwSequence.add(capstat.utils.Throw.createHit());
}