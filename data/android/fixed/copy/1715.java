@java.lang.Override
public void onStop() {
    if (gapiClient.isConnected()) {
        gapiClient.disconnect();
    }
    super.onStop();
}