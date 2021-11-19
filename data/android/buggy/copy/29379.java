@java.lang.Override
public void onClick(android.view.View view) {
    com.example.eltonxue.rehearseit.RehearseIt.stopRecording();
    com.example.eltonxue.rehearseit.RehearseIt.startPlaying();
    RehearseIt.recording = !(RehearseIt.recording);
}