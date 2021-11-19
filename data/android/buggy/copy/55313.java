@java.lang.Override
public void run() {
    org.mozilla.gecko.push.PushService.getInstance().onMessageReceived(this, bundle);
}