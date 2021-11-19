@java.lang.Override
public void onPlayListDeleted(com.example.user.cloudplayer.model.PlayList playList) {
    sendToast(getResources().getString(R.string.on_playList_deleted));
}