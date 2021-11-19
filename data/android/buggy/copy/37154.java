@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_common_sign_in_sign_up);
    android.content.Intent intent = new android.content.Intent(this, guuber.cmu.edu.activities.passenger.ViewHistoryActivity.class);
    intent.putExtra("userName", "Bob");
    startActivity(intent);
}