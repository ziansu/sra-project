public java.lang.String getPrefix() {
    if ((prefix) == null) {
        prefix = me.shadorc.discordbot.Storage.getSetting(this.getGuild(), Setting.PREFIX).toString();
    }
    return prefix;
}