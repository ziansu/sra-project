public void start_voicecall(java.lang.Boolean SS) {
    android.content.Intent intent = new android.content.Intent(this, com.rm.flashinglight.Text_to_speech.class);
    if (SS) {
        this.startService(intent);
    }else {
        this.stopService(intent);
    }
}