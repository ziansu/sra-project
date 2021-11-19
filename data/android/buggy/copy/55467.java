@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (type != (io.github.sdsstudios.ScoreKeeper.Dialog.ADD_PLAYER)) {
        mGame.setPlayer(oldPlayer, position);
    }
    dialog.dismiss();
    onDialogClose();
}