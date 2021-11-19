@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    serverThread.interrupt();
    if ((server) != null) {
        server.exit();
    }
}