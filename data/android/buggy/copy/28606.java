@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_setting);
    com.kudakoding.aaizat.kraider.SettingActivity.ipvalue = "192.168.0.1";
    addListenerOnButton();
}