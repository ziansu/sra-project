public void close() {
    stopBgTask();
    xmlsocket.close();
    xmlsocket = null;
}