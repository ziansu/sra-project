@java.lang.Override
protected void doStart() throws java.lang.Exception {
    de.or.xuggler.plugin.XugglerPlugin.logInstalledCodes();
    de.or.plugin.registry.VideoPluginRegistry.getInstance().addPlugin(this);
}