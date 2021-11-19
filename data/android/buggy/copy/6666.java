public final void setChosen(boolean chosen) {
    if (chosen) {
        setScore(scoreIfChosen);
    }else {
        setScore(scoreIfUnchosen);
    }
    this.chosen = chosen;
}