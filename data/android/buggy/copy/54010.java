@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.e("ApplicationScreen", "onClick");
    if ((com.almalence.opencam.ApplicationScreen.mApplicationStarted) && (com.almalence.opencam.ApplicationScreen.mCameraStarted))
        com.almalence.opencam.ApplicationScreen.getGUIManager().onClick(v);
    
}