@java.lang.Override
public void onStop() {
    super.onStop();
    if (setupFinished) {
        voiceOutput.killService();
    }
}