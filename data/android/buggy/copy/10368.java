@java.lang.Override
public void onBeginningOfSpeech() {
    android.util.Log.d("onBeginningOfSpeech", "onBeginningOfSpeech");
    TTSIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
}