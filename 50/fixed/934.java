private void stopPlayingPlayList() {
    es.shutdownNow();
    sendCommand("echo stop > fifofile");
    sendCommand("rm fifofile");
}