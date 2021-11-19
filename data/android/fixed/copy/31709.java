public void removeGroupChat(java.lang.String name) {
    if (groupChatChannels.containsKey(name)) {
        groupChatChannels.remove(name);
        return ;
    }
}