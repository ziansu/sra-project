public java.lang.String parseWithPrefix(java.lang.String... params) {
    return (org.melonbrew.fe.Phrase.plugin.getMessagePrefix().replace("$1", org.melonbrew.fe.Phrase.plugin.getConfig().getString("prefix"))) + (parse(params));
}