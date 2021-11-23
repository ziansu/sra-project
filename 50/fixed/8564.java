@java.lang.Override
public boolean onOverrideUrlLoading(java.lang.String url) {
    mPluginLayout.isSuspended = true;
    plugin.google.maps.CordovaGoogleMaps.CURRENT_URL = url;
    return false;
}