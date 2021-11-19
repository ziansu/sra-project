public boolean setVolume(byte volume) {
    if (volume > 0) {
        mute = false;
    }
    if ((this.volume) != volume) {
        this.volume = volume;
        checkedNotifyObserver();
        return true;
    }
    return false;
}