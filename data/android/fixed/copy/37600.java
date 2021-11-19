@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String myoGesture = intent.getStringExtra("gesture");
    handleGesture(context, myoGesture);
}