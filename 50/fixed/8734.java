public static void log(net.dv8tion.jda.core.entities.Message m) {
    if (!(com.tisawesomeness.minecord.Config.getLogChannel().equals("0"))) {
        Bot.jda.getTextChannelById(com.tisawesomeness.minecord.Config.getLogChannel()).sendMessage(m).queue();
    }
}