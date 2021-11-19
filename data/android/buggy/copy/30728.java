@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    onBackpackSceneCompleteListener.onBackpackSceneComplete(false, true);
    dialog.dismiss();
}