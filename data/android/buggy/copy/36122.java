@java.lang.Override
protected void setup(sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent event) {
    response = "";
    messageText = format(event);
    tokens = tokenize(event);
    variables = Brain.guildIndex.get(event.getGuild());
    tokens.remove(0);
}