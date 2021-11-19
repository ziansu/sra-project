public Frame getFrame(int i) {
    if (i < (myFrames.length)) {
        return myFrames[(i - 1)];
    }
    return null;
}