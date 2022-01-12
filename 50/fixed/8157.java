private void showSmsToast(com.unifyx.messagelistener.Sms sms) {
    android.widget.Toast.makeText(this, sms.toString(), Toast.LENGTH_LONG).show();
}