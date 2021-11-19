@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    try {
        handleIntent(intent);
    } catch (com.qualicom.emvpaycard.EmvPayCardException e) {
        e.printStackTrace();
    }
}