private void sendRequest(java.io.OutputStream os, java.lang.String request) {
    if (requestChanged) {
        writeRequest(os, request);
        requestChanged = false;
    }
}