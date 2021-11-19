@java.lang.Override
public void onMessage(final com.avoscloud.chat.service.chat.AVIMTypedMessage message, final com.avoscloud.chat.service.chat.AVIMConversation conversation, com.avoscloud.chat.service.chat.AVIMClient client) {
    com.avoscloud.chat.service.chat.IM.im.onMessage(message, conversation);
}