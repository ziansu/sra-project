@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    startActivity(new android.content.Intent(this, com.codeartist.applocker.activity.DummyActivity.class));
    finish();
}