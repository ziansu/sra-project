public void stopContainerLogReaderById(java.lang.String containerId) {
    log.ContainerLogReader logReaderToRemove = runningContainerMap.remove(containerId);
    if (logReaderToRemove != null) {
        logReaderToRemove.stop();
        newAppList.remove(containerIdToAppId(containerId));
    }
}