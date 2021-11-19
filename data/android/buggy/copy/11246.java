@java.lang.Override
public void onClick(android.view.View v) {
    if ((actionState) == (com.playposse.ghostphoto.PhotoFragment.ActionState.running)) {
        stopTakingPhotos();
        actionState = com.playposse.ghostphoto.PhotoFragment.ActionState.stopped;
    }else {
        startTakingPhotos();
        actionState = com.playposse.ghostphoto.PhotoFragment.ActionState.running;
    }
    refreshActionButton();
}