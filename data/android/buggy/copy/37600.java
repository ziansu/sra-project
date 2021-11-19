@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String myoGesture = intent.getStringExtra("gesture");
    android.util.Log.i(com.example.drdc_admin.moverioapp.activities.ContentActivity.TAG, ("Got message: " + myoGesture));
    handleGesture(context, myoGesture);
}