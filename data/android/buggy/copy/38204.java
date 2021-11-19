@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int whichButton) {
    mAlertHandler = null;
    mTimer.cancel();
    modifyBootIni();
}