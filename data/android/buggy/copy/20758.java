public void stop() {
    if (!(org.droidplanner.services.android.BuildConfig.SITL_DEBUG)) {
        controllerLinkManager.stop();
    }
    soloLinkMgr.stop();
}