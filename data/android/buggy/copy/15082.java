public void removeDockerMonitor(java.lang.String containerId) {
    docker.DockerMonitor dockerMonitorToRemove = containerIdToDM.remove(containerId);
    if (dockerMonitorToRemove != null) {
        dockerMonitorToRemove.stop();
    }
    tracer.removeContainerLogReader(containerId);
}