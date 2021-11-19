@java.lang.Override
public void onRemotePlayCompleteASong() {
    training.com.tplayer.utils.LogUtils.printLog("Client_onRemotePlayCompleteASong");
    mImvPlayPause.setSelected(false);
}