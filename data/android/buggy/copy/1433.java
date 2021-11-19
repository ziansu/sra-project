public void onReady(net.dv8tion.jda.core.events.ReadyEvent event) {
    for (net.dv8tion.jda.core.entities.Guild g : event.getJDA().getGuilds()) {
        g.getTextChannels().get(1).sendMessage("WyattMusicBot is ready.").queue();
    }
}