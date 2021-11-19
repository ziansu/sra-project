@java.lang.Override
protected void doStop() throws java.lang.Exception {
    de.or.plugin.registry.VideoPluginRegistry.getInstance().removePlugin(this);
}