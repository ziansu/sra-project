@java.lang.Override
public void onClick(android.view.View view) {
    if (RehearseIt.recording) {
        com.example.eltonxue.rehearseit.RehearseIt.stopRecording();
        com.example.eltonxue.rehearseit.RehearseIt.startPlaying();
    }
}