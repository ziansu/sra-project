@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    super.onDismiss(dialog);
    if ((callback) != null) {
        callback.onDismiss();
    }
}