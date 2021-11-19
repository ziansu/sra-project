@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.Parse.initialize(this, "FHwTc8y140hzykJ9bRRf5rcQAx9fIWENsF5Og9Xh", "98T1AS8768nb2UAMiaaGL1SuecHaYooPZo4w8IH5");
    parse = new com.parse.ParseObject("ParseObj");
}