@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    selectedEntry = which;
    super.onClick(dialog, DialogInterface.BUTTON_POSITIVE);
    dialog.dismiss();
}