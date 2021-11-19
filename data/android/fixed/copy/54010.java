@java.lang.Override
public void onClick(android.view.View v) {
    if (com.almalence.opencam.ApplicationScreen.mApplicationStarted)
        com.almalence.opencam.ApplicationScreen.getGUIManager().onClick(v);
    
}