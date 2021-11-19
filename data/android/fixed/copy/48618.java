@java.lang.Override
public void disconnected() {
    if (((it.vibwear.app.ModuleActivity.device) != null) && ((mwController) != null)) {
        tryReconnect();
    }else {
        switchController.disableNotification();
    }
    invalidateOptionsMenu();
}