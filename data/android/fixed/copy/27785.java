@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
    return dialog;
}