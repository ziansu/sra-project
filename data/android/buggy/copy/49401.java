public boolean isProcessing(controller.channel.Channel channel) {
    if (mProcessingChains.containsKey(channel.getChannelID())) {
        return mProcessingChains.get(channel.getChannelID()).isProcessing();
    }
    return false;
}