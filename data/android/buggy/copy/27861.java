@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    if (com.vibejukebox.jukebox.activities.VibeJukeboxMainActivity.DEBUG)
        android.util.Log.d(com.vibejukebox.jukebox.activities.VibeJukeboxMainActivity.TAG, "onCreate()");
    
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_jukebox_main);
    buildGoogleApiClient();
}