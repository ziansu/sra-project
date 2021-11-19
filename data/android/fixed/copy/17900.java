public final void removeChannel(java.lang.String channel) {
    synchronized(channels) {
        channels.remove(channel.toUpperCase());
        try {
            com.mak001.ircbot.SettingsManager.save();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}