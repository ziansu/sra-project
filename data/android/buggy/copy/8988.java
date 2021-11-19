@java.lang.Override
public T parseArgument(net.minecraft.server.MinecraftServer server, net.minecraft.command.ICommandSender sender, java.lang.String argument) {
    return java.lang.Enum.valueOf(enumClass, argument.toLowerCase(java.util.Locale.ENGLISH));
}