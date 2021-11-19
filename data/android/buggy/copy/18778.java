private void stopRecording() {
    recorder.stop();
    recorder.release();
    recorder = null;
}