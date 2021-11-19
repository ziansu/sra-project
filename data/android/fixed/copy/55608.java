public void run() {
    while (true) {
        if (!(isRecordingState)) {
            audioRecorder.stopRecording();
            return ;
        }
    } 
}