public void recordHit() {
    this.throwSequence.add(capstat.utils.Throw.createHit());
    if (!(this.isDuelling())) {
        this.notifyDuelObservers();
        this.switchPlayerUpNext();
    }
}