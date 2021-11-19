@java.lang.Override
public void onClick(android.view.View v) {
    if (!(accent_flag)) {
        com.example.cesarsk.say_it.MainActivity.tts.setVoice(com.example.cesarsk.say_it.MainActivity.voice_british_female);
        accent_flag = !(accent_flag);
    }else {
        com.example.cesarsk.say_it.MainActivity.tts.setVoice(com.example.cesarsk.say_it.MainActivity.voice_american_female);
        accent_flag = !(accent_flag);
    }
}