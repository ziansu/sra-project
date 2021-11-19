public static void addChatMessage(net.minecraft.command.ICommandSender sender, net.minecraft.util.text.TextComponentTranslation msg) {
    net.minecraft.util.text.TextComponentTranslation cct = new net.minecraft.util.text.TextComponentTranslation(java.lang.String.format("[%s] ", ForgeCreeperHeal.MODNAME));
    cct.appendSibling(msg);
    sender.addChatMessage(cct);
}