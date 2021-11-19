public void checkWin() {
    if (this.mainHopscotch.checkWin()) {
        kl.win();
    }
    this.mainHopscotch.clearChecked();
}