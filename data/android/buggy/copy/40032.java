@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.i(com.example.eurka.comp90018.MyIntentService.TAG, "starting!!");
    android.util.Log.i(com.example.eurka.comp90018.MyIntentService.TAG, "THIS WAS HIT IN THE BACKGROUND SERVICE");
    startLogging();
    return 0;
}