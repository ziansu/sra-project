@java.lang.Override
public void run() {
    if ((mp) != null) {
        callbackContext.error("Player not initialised");
    }
    callbackContext.success(handleSetVolumeResult(activity, volume));
}