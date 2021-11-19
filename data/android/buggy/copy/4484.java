@java.lang.Override
public void onMessageReceived(java.lang.String endpointId, byte[] payload, boolean isReliable) {
    if (!isReliable) {
        return ;
    }
    int message = de.handler.mobile.android.videobox.MessageHelper.unmapPayload(payload);
    this.handleMessage(message);
}