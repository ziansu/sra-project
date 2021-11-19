public void stopRecording() {
    mediaRecorder.stop();
    mediaRecorder.reset();
    mediaRecorder.release();
    mediaRecorder = null;
    com.byteshatf.callrecorder.CallRecording.isRecording = false;
}