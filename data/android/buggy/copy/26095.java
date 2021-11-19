public void signalResponseAvailable() {
    log.i(org.opendatakit.views.ODKWebView.t, (("[" + (this.hashCode())) + "] signalResponseAvailable()"));
    loadJavascriptUrl("javascript:odkData.responseAvailable();");
}