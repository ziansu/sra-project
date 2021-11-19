public void loadCatalog(java.lang.Class<?> clazz) throws java.io.IOException {
    allPlugins = org.coreasm.engine.loader.PluginClassLoader.loadCatalog(capi, clazz);
}