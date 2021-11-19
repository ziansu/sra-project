public synchronized void addBasicPlugin(java.lang.Object plugin) {
    basicPlugins.add(plugin);
    if ((plugins) != null)
        plugins.add(plugin);
    
}