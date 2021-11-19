@java.lang.Override
public void onTopTenDownloaded(java.util.ArrayList<com.example.user.cloudplayer.model.PlayList> playLists) {
    sendToast(getResources().getString(R.string.top_ten_alert));
}