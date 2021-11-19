public void add(com.example.felipe.androidchat.entities.ChatMessage msg) {
    if (!(alreadyInAdapter(msg))) {
        this.chatMessages.add(msg);
        this.notifyDataSetChanged();
    }
}