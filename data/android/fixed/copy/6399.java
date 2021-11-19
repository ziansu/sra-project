@android.annotation.TargetApi(value = 21)
private void speakOut() {
    tts.speak(txtFromDesc.getText().toString(), TextToSpeech.QUEUE_FLUSH, null, UTTERANCE_ID);
}