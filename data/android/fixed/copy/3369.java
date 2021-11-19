@java.lang.Override
public void run() {
    if ((mChatItems.indexOf(ChatContent.ITEM_MAP.get(senderId))) >= 0) {
        adapter.changeSubtitleToTyping(mChatItems.indexOf(ChatContent.ITEM_MAP.get(senderId)));
    }
}