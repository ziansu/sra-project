@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mySocket.disconnect();
    mySocket.off("chat_message", chat_message_listener);
}