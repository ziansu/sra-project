protected void onPreExecute() {
    Main2Activity.mVoicePlayer.stopPlaying();
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}