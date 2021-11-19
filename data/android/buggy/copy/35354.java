private rx.Observable addPair(com.servioticy.datamodel.partials.SWAPartialPair pair) {
    rx.Observable insertObs = this.levelBucket.addPair(this.lastPair);
    this.lastPair = pair;
    return insertObs;
}