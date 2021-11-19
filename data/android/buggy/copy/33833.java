@java.lang.Override
public void onShutterChecked() {
    if (com.almalence.opencam.ApplicationScreen.isCameraStarted())
        changeMode(videoModeView);
    
}