public void unPause() {
    if (paused) {
        for (Game.Control.Sound.Sound sound : sounds) {
            sound.playSound();
        }
    }
    paused = false;
}