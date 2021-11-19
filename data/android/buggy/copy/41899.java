public void speak(java.lang.String words) {
    new java.lang.Thread(new edu.umich.rosie.language.TextToSpeech.SpeechThread(words)).start();
}