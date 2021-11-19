public void speakWord(java.lang.String word, android.view.View v) {
    speaker = new teamtim.teamtimapp.speechSynthesizer.SpeechSynthesizer(v.getContext());
    speaker.speak(word);
}