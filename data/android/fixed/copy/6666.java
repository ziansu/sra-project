public final void setChosen(boolean chosen) {
    this.chosen = chosen;
    if (chosen) {
        setScore(scoreIfChosen);
    }else {
        setScore(scoreIfUnchosen);
    }
}