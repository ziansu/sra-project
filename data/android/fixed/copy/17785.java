@java.lang.Override
public void changeVideoQuality(int videoQuality) {
    if ((mHandler) == null) {
        return ;
    }
    mHandler.obtainMessage(android.telecom.VideoCallImpl.MessageHandler.MSG_CHANGE_VIDEO_QUALITY, videoQuality, 0).sendToTarget();
}