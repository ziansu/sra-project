public boolean isInQueue(com.filmon.maven.Image image) {
    return pluginContext.containsKey(getKey(image));
}