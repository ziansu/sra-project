private void success() {
    _callbackContext.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.OK));
    _callbackContext.success();
}