public void onPictureTaken(java.lang.String originalPicture) {
    org.json.JSONArray data = new org.json.JSONArray();
    data.put(originalPicture);
    org.apache.cordova.PluginResult pluginResult = new org.apache.cordova.PluginResult(PluginResult.Status.OK, data);
    pluginResult.setKeepCallback(true);
    takePictureCallbackContext.sendPluginResult(pluginResult);
}