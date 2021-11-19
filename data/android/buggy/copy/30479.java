@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    navgnss.com.library.DynamicNumImageView testDiv1 = ((navgnss.com.library.DynamicNumImageView) (findViewById(R.id.test_1_div_1)));
    testDiv1.setTextContent("12");
}