public com.mak001.ircbot.irc.Channel getChannelByName(java.lang.String chan) {
    synchronized(channels) {
        return channels.get(chan.toUpperCase());
    }
}