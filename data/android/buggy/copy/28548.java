@java.lang.Override
public boolean enqueueMessage(final com.gmail.inverseconduit.datatype.ChatMessage chatMessage) {
    java.lang.System.out.println(("Got a message enqueued: " + (chatMessage.getMessage())));
    tableModel.addNewMessage(chatMessage);
    return true;
}