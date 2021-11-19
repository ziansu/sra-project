protected void displayErrorSCNotFound(net.minecraft.command.ICommandSender sender) {
    sendChat(sender, getSubcommandNotFound1(), null, null);
    sendChat(sender, getSubcommandNotFound2(), null, null);
}