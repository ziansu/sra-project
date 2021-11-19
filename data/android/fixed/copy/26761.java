@java.lang.Override
protected void messageReceived(net.beadsproject.beads.core.Bead bead) {
    sleigher.zombie.ZombieSleigher.backgroundSound.sample.setLoopType(SamplePlayer.LoopType.LOOP_FORWARDS);
    sleigher.zombie.ZombieSleigher.backgroundSound.play();
    this.pause(true);
}