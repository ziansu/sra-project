@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.i("forserv ", "yo :3");
    android.widget.Toast.makeText(this, "Have the safest of trips!", Toast.LENGTH_SHORT).show();
    return START_STICKY;
}