@java.lang.Override
public void onInit(int status) {
    tts.setLanguage(java.util.Locale.GERMANY);
    tts.setSpeechRate(0.55F);
    speakOrShutUp("Vet ni att tyska låter nästan som svenska.");
}