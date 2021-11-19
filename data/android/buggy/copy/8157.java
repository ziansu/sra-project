private void showSmsToast(com.unifyx.messagelistener.Sms sms) {
    android.widget.Toast.makeText(this, sms.getMsg(), Toast.LENGTH_LONG).show();
}