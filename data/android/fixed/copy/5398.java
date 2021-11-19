private static void writeChannelConfig(com.github.otbproject.otbproject.api.ChannelConfig config, java.lang.String channel) {
    com.github.otbproject.otbproject.util.JsonHandler.writeValue(com.github.otbproject.otbproject.api.APIConfig.getChannelPath(channel), config);
}