public boolean checkCost(me.krickl.memebotj.User.UserHandler sender, double cost) {
    if ((commandHandler) == null) {
        commandHandler = new me.krickl.memebotj.Commands.CommandHandler(channelHandler, commandName, dbprefix);
    }
    return commandHandler.checkCost(sender, cost);
}