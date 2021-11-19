@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    context.sendBroadcast(io.github.mobodev.heartbeatfixerforgcm.HeartbeatReceiver.GTALK_HEART_BEAT_INTENT);
    context.sendBroadcast(io.github.mobodev.heartbeatfixerforgcm.HeartbeatReceiver.MCS_MCS_HEARTBEAT_INTENT);
    android.util.Log.d(io.github.mobodev.heartbeatfixerforgcm.HeartbeatFixerForGcmApp.TAG, "HeartbeatReceiver sent heartbeat request");
    io.github.mobodev.heartbeatfixerforgcm.HeartbeatFixerUtils.scheduleHeartbeatRequest(context, false);
}