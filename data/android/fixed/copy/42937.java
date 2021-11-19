public void init() {
    mOpusTool = new top.oply.opuslib.OpusTool();
    filePath = getNextFile();
    int rst = mOpusTool.startRecording(filePath);
}