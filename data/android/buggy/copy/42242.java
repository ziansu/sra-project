@java.lang.Override
public void onReady() {
    com.eikospartners.windowmanagerjsdemo.Main.logMessage("CONNECTED!");
    for (com.eikospartners.windowmanagerjsdemo.helper.ReadyListener listener : readyListeners)
        listener.Ready();
    
}