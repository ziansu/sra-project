@org.robolectric.annotation.Implementation
public void send() throws android.app.PendingIntent.CanceledException {
    send(null, 0, null);
}