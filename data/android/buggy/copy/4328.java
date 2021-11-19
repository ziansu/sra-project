public void add(edu.rosehulman.sunz1.rosechat.models.Chat chat) {
    mChats.add(chat);
    notifyItemInserted(((mChats.size()) - 1));
}