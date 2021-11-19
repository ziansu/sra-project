@java.lang.Override
public java.lang.String channelIdToName(java.lang.String channelId) {
    return this.chats.get(java.lang.Long.parseLong(channelId));
}