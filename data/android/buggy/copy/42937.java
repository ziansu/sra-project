public void init() {
    mOpusTool = new top.oply.opuslib.OpusTool();
    int rst = mOpusTool.startRecording(getNextFile());
}