@java.lang.Override
protected void onPause() {
    if ((speaker) != null) {
        speaker.stop();
        speaker.shutdown();
    }
    if ((client) != null)
        client.stop();
    
    super.onPause();
}