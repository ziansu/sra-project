public static void msg(sx.blah.discord.handle.obj.IChannel channel, sx.blah.discord.api.internal.json.objects.EmbedObject message) {
    try {
        channel.sendMessage("", message, true);
    } catch (java.lang.Exception e) {
        Main.log.error(e);
    }
}