@mytown.core.utils.command.CommandNode(name = "reset", permission = "mytown.cmd.everyone.plot.select.reset", parentName = "mytown.cmd.everyone.plot.select")
public static void plotSelectResetCommand(net.minecraft.command.ICommandSender sender, java.util.List<java.lang.String> args) {
    mytown.commands.Resident res = getDatasource().getOrMakeResident(sender);
    res.resetSelection(true);
    mytown.core.ChatUtils.sendLocalizedChat(sender, getLocal(), "mytown.notification.plot.selectionReset");
}