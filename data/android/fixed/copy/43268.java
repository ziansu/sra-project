@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    final java.lang.String action = intent.getAction();
    if (action.equals(Utils.STOP_RECORDING)) {
        stopRecordingAudio();
        stopSelf();
    }
}