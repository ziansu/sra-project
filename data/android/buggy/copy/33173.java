@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    android.widget.Toast.makeText(this, ((java.lang.CharSequence) (msg.toString())), Toast.LENGTH_LONG).show();
}