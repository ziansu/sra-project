@java.lang.Override
public void onMessageSent(java.lang.String msgId) {
    sendNotification(("Upstream message sent. Id=" + msgId));
}