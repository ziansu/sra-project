public synchronized void removeBasicPlugin(java.lang.Object plugin) {
    basicPlugins.remove(plugin);
    if ((plugins) != null)
        plugins.remove(plugin);
    
}