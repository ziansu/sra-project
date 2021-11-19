public boolean isPlaying() {
    if (!(com.calcprogrammer1.calctunes.LosslessMediaCodecHandler.stopped)) {
        return paused;
    }else {
        return false;
    }
}