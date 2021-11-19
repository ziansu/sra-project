private void pause(IChannel channel, boolean pause) {
    getPlayer(channel.getGuild()).setPaused(pause);
}