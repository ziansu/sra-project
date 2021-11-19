public final void addUser(com.mak001.ircbot.irc.User user, java.lang.String channel) {
    synchronized(channels) {
        if (channels.containsKey(channel))
            channels.get(channel).addUser(user);
        
    }
}