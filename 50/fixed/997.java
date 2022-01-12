@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    org.gtlp.yasb.SoundActivity.preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    org.gtlp.yasb.SoundActivity.soundPlayerInstance = new org.gtlp.yasb.SoundPlayer(this);
    initUI();
    restoreInstance(savedInstanceState);
}