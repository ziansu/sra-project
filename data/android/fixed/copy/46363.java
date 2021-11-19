@java.lang.Override
public void onDialogPositiveClick(android.app.DialogFragment dialog) {
    android.os.Bundle mArgs = dialog.getArguments();
    java.lang.String name = mArgs.getString("name");
    java.lang.String uri = mArgs.getString("uri");
    socialAdd(uri);
    showNoticeDialog(name);
}