public boolean start() {
    if ((com.calcprogrammer1.calctunes.LosslessMediaCodecHandler.th) != null) {
        if (!(com.calcprogrammer1.calctunes.LosslessMediaCodecHandler.stopped)) {
            if (paused) {
                resume();
            }
        }
    }else {
        seekTo(0);
    }
    return true;
}