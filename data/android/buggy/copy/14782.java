@java.lang.Override
public final void runCommand(sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent event, java.lang.String args) {
    rexCord.sendMessage(event.getChannel(), ((commands.MathCommand.MESSAGE_HEADER) + (utils.MathHandler.handleOperation(args))));
}