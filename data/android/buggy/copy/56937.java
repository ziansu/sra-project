public com.mak001.ircbot.irc.Channel getChannelByName(java.lang.String chan) {
    synchronized(channels) {
        return channels.get(chan.replace((("[" + (com.mak001.ircbot.IRCBot.CHANNEL_PREFIXES)) + "]+"), ""));
    }
}