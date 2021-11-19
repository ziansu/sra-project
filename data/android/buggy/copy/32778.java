@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.example.com.broadcastbestpractice.ActivityCollector.finishAll();
    android.content.Intent intent1 = new android.content.Intent(context, com.example.com.broadcastbestpractice.LoginActivity.class);
    context.startActivity(intent);
}