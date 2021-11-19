private boolean isProcessing(controller.channel.Channel channel) {
    return (mProcessingChains.containsKey(channel.getChannelID())) && (mProcessingChains.get(channel.getChannelID()).isProcessing());
}