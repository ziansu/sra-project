public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    android.content.Intent intent = getIntent();
    startService(new android.content.Intent(this, ru.mityaresh.cadromonitor.MyService.class));
    finish();
}