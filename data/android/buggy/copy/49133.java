@java.lang.Override
public void onPause() {
    super.onResume();
    com.wenjiehe.xingji.Im.NotificationUtils.removeTag(imConversation.getConversationId());
}