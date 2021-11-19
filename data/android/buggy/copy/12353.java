@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_done_verification);
    android.content.Intent intent = getIntent();
    image_path = intent.getStringExtra("ImagePathForAvatar");
}