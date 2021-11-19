@java.lang.Override
public boolean enqueueMessage(final com.gmail.inverseconduit.datatype.ChatMessage chatMessage) {
    tableModel.addNewMessage(chatMessage);
    return true;
}