@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    startService(new android.content.Intent(this, smartext.com.smscapture.SmsListenerService.class));
}