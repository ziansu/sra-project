private void didFindLine() {
    lejos.hardware.Sound.beepSequenceUp();
    this.hal.stop();
    this.sharedState.setState(State.LineSearch);
}