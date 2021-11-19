@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    app.minimize.com.seek_bar_compat.MaterialSeekBar materialSeekBar = ((app.minimize.com.seek_bar_compat.MaterialSeekBar) (findViewById(R.id.materialSeekBar)));
    materialSeekBar.setThumbColor(Color.BLUE);
    materialSeekBar.setProgressColor(Color.RED);
}