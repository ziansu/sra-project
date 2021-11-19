protected boolean isImmersiveModeSupported() {
    boolean supported = (Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT);
    org.apache.cordova.PluginResult res = new org.apache.cordova.PluginResult(PluginResult.Status.OK, supported);
    context.sendPluginResult(res);
    return true;
}