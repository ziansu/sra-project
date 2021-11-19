protected void addChannel(de.dk.util.channel.Channel<?> channel, de.dk.util.channel.ChannelHandler<?> handler) {
    channels.put(channel.getId(), channel);
    if (handler != null)
        channelAssociatedHandlers.put(channel.getId(), handler);
    
}