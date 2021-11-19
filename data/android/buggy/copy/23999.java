@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    stopPublish();
    stopRecordAnimation();
    showDetailDialog();
}