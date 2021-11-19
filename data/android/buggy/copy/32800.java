public void forceStopTask() {
    java.lang.System.out.println("stopping...");
    closeSocket();
    executorService.shutdownNow();
}