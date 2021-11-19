@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    org.apache.cordova.PluginResult errorResult = convertToPluginResult(PluginResult.Status.ERROR, databaseError, false);
    callbackContext.sendPluginResult(errorResult);
}