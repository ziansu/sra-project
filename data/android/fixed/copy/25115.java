public static void shutdown() {
    if ((scadinspect.control.LogHandler.fileHandler) != null) {
        scadinspect.control.LogHandler.fileHandler.close();
    }
}