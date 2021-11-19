@android.annotation.TargetApi(value = 21)
private void speakOut() {
    java.lang.String exScene = "Team rocket had stolen four of your Poke e mawn. You followed them to a haunted house. The front door is locked. There is a mailbox to the right and a lantern to the left.";
    java.lang.String testScene = "Articuno, Pikachu, Charmander, Onyx";
    tts.speak(txtFromDesc.getText().toString(), TextToSpeech.QUEUE_FLUSH, null, UTTERANCE_ID);
}