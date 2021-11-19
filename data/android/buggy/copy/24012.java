protected void displayErrorSCNotFound(net.minecraft.command.ICommandSender sender, crowsofwar.gorecore.command.GoreCoreMultiCommand.Subcommand subcommand) {
    sendChat(sender, getSubcommandNotFound1(), null, subcommand.getSubcommandName());
    sendChat(sender, getSubcommandNotFound2(), null, subcommand.getSubcommandName());
}