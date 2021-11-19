@java.lang.Override
public void onTopTenDownloaded(java.util.ArrayList<com.example.user.cloudplayer.model.PlayList> playLists) {
    if (playLists == null) {
        sendToast(getResources().getString(R.string.top_ten_alert));
    }
}