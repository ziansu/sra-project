@java.lang.Override
public void onClick(android.view.View v) {
    com.example.yass8n.whozthis.activities.MainActivity.current_conversation = conversation;
    startActivity(new android.content.Intent(this, com.example.yass8n.whozthis.activities.MessagingActivity.class));
}