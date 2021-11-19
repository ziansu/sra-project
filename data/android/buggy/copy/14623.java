@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    org.llama.llama.model.Chat c = dataSnapshot.getValue(org.llama.llama.model.Chat.class);
    c.setId(chatId);
    addChat(c);
}