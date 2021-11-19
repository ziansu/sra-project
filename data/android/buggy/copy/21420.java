@java.lang.Override
public void onLost(com.google.android.gms.nearby.messages.Message message) {
    java.lang.String messageAsString = new java.lang.String(message.getContent());
    android.util.Log.d(((de.ifgi.sc.smartcitiesapp.main.MainActivity.TAG) + " P2P"), ("Lost sight of message: " + messageAsString));
}