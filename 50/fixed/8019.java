@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((currentRecordingState) != (com.github.stevewhit.mouserecorder.ui.MouseRecorderGUI.RecordingStates.Disable)) {
        setRecordingState(com.github.stevewhit.mouserecorder.ui.MouseRecorderGUI.RecordingStates.Disable);
        setPlaybackState(com.github.stevewhit.mouserecorder.ui.MouseRecorderGUI.PlaybackStates.Enable);
    }else {
        setPlaybackState(com.github.stevewhit.mouserecorder.ui.MouseRecorderGUI.PlaybackStates.Disable);
        setRecordingState(com.github.stevewhit.mouserecorder.ui.MouseRecorderGUI.RecordingStates.Enable);
    }
}