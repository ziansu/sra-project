@java.lang.Override
public boolean checkPermission(net.minecraft.server.MinecraftServer server, net.minecraft.command.ICommandSender sender) {
    return sender.canUseCommand(3, "");
}