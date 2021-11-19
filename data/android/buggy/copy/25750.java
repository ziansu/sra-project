@java.lang.Override
public void onInit(final int status) {
    tts.setLanguage(java.util.Locale.US);
    counter.setEnabled((status == (android.speech.tts.TextToSpeech.SUCCESS)));
}