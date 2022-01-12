public static de.jukusoft.tutorial.chat.server.message.ChatMessage create(org.json.JSONObject json) {
    final de.jukusoft.tutorial.chat.server.message.ChatMessage msg = new de.jukusoft.tutorial.chat.server.message.ChatMessage();
    msg.text = json.getString("text");
    return msg;
}