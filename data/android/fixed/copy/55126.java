@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    startService(new android.content.Intent(this, com.example.jimmyle.pacmanandroid.BackgroundMusicService.class));
}