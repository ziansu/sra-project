@java.lang.Override
public void run() {
    android.util.Log.d("CALL_INTEGRATION", "CallActivity. initSwitchSpeakerTask lunched");
    videoChatHelper.switchMic();
}