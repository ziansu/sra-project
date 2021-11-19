public void startAudioRecorder() {
    babyfon.view.activity.MainActivity.mAudioRecorder = new babyfon.audio.AudioRecorder(babyfon.view.activity.MainActivity.mConnection);
    MainActivity.mAudioRecorder.startRecording();
}