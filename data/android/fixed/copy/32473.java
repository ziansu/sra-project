private void handlePluginException(java.lang.Throwable e) {
    PluginHandler.pluginLoadingExceptions.put(getPluginInformation().name, e);
    org.openstreetmap.josm.tools.bugreport.BugReportExceptionHandler.handleException(new org.openstreetmap.josm.plugins.PluginException(this, getPluginInformation().name, e));
}