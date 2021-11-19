@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        de.mkrtchyan.recoverytools.FlashUtil.uninstallXZDual(mActivity.getShell());
    } catch (org.sufficientlysecure.rootcommands.util.FailedExecuteCommand failedExecuteCommand) {
        failedExecuteCommand.printStackTrace();
    }
}