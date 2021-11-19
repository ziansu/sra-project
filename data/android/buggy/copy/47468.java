public boolean handleCooldown(me.krickl.memebotj.User.UserHandler sender) {
    if ((commandHandler) == null) {
        commandHandler = new me.krickl.memebotj.Commands.CommandHandler(channelHandler, commandName, dbprefix);
    }
    return commandHandler.handleCooldown(sender);
}