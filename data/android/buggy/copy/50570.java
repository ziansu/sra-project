private void updateHeadersRawData(java.lang.String data) {
    headersData = data;
    if ((headersCodeMirror) != null) {
        headersCodeMirror.setValue(data);
        headersCodeMirror.refresh();
    }
}