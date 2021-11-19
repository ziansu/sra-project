public void setPlaying(boolean playing) {
    if ((this.playing) != playing) {
        this.playing = playing;
        checkedNotifyObserver();
    }
}