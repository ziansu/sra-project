public void close() {
    stopBgTask();
    if ((xmlsocket) != null) {
        xmlsocket.close();
        xmlsocket = null;
    }
}