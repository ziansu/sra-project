public void restartSpeech() {
    speakerOut.speak("Parada", TextToSpeech.QUEUE_ADD, null);
    while (speakerOut.isSpeaking()) {
    } 
    sr.startListening(android.speech.RecognizerIntent.getVoiceDetailsIntent(getApplicationContext()));
}