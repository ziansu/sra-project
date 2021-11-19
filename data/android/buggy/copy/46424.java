private void startRecording() {
    recorder = initializeRecorder();
    recorder.start();
    (recordCount)++;
}