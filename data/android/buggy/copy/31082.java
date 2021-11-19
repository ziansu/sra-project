@java.lang.Override
public void onClick(android.view.View v) {
    if (!(accent_flag))
        com.example.cesarsk.say_it.MainActivity.american_speaker_google.speak(com.example.cesarsk.say_it.PlayActivity.selected_word, android.speech.tts.TextToSpeech.QUEUE_FLUSH, null, null);
    else
        com.example.cesarsk.say_it.MainActivity.british_speaker_google.speak(com.example.cesarsk.say_it.PlayActivity.selected_word, android.speech.tts.TextToSpeech.QUEUE_ADD, null, null);
    
}