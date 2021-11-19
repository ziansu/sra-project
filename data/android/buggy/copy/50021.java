public void run() {
    java.lang.String message = com.github.ucchyocean.chatbot.irc.IRCColor.convRES2IRC(format.replace("%name", event.getPlayer().getName()));
    bot.sendIRC().message(config.getChannel(), message);
}