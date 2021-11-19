public void recognizeSpeech(java.lang.String startMessage) {
    android.content.Intent i = new android.content.Intent();
    startPrompt = startMessage;
    sr.startListening(i);
}