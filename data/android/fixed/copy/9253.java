public cviz.config.TimelineConfig findChannelById(java.lang.String id) {
    for (cviz.config.TimelineConfig channel : channels) {
        if (channel.getId().equals(id))
            return channel;
        
    }
    return null;
}