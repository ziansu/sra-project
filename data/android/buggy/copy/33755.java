@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    setContentView(R.layout.activity_info_preview);
    descendants(savedInstanceState);
    db = new com.itechex.centraly.credentials.database.DatabaseController(this);
    initOfFields();
    populatingView();
}