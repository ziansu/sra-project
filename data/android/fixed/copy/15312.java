@java.lang.Override
public void onLinkDisconnected() {
    if ((compListener) != null)
        compListener.onDisconnected();
    
    soloLinkMgr.stop();
    if (!(org.droidplanner.services.android.BuildConfig.SITL_DEBUG)) {
        controllerLinkManager.stop();
    }
}