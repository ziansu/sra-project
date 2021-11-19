@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((sPort) != null) {
        try {
            sPort.close();
        } catch (java.io.IOException e) {
        }
        sPort = null;
    }
}