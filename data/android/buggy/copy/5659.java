@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_customer_sign_up_page_one);
    setEditTexts();
    humLogController = ((com.example.praduman.humlog.HumLogController) (getIntent().getSerializableExtra("controllerObject")));
    setIntentAndButton();
}