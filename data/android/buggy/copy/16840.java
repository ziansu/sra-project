public final boolean setProvider(de.codemakers.bot.supreme.plugin.PluginProvider provider) {
    this.provider = new de.codemakers.bot.supreme.plugin.PluginProviderPlus(provider, this);
    return (this.provider) != null;
}