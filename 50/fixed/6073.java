public com.mister.lib.model.Round getNextRound() {
    if (((lastRoundPointer) + 1) < (rounds.size())) {
        return rounds.get(((lastRoundPointer) + 1));
    }
    return null;
}