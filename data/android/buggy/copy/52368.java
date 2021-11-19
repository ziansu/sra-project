public void saveBuffer() throws java.io.IOException {
    recordingInfo.add("buffer");
    if (saveLocally) {
        client.FileOperations.fileSaving(filename, audioCaptureThread.getRecordedBytes(), username, audioFormat, true, getLocalPath());
    }
}