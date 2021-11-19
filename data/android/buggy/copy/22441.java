@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d("hell", "Alarm receiver works perfectly");
    android.content.Intent in = new android.content.Intent(context, com.delta.attendancemanager.Userhome.class);
    in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(in);
}