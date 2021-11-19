@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((android.content.DialogInterface.BUTTON_POSITIVE) == which) {
        clearModelManager();
        copyDefaultConfig();
        loadModelManager();
        isAlertDialogShown = false;
    }
}