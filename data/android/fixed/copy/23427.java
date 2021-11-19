private boolean onRecord(boolean canRecord) {
    if (canRecord) {
        return startRecording();
    }else {
        return stopRecording();
    }
}