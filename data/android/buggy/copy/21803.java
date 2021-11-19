public void start() {
    tm = ((android.telephony.TelephonyManager) (ctx.getSystemService(Context.TELEPHONY_SERVICE)));
    tm.listen(callStateListener, PhoneStateListener.LISTEN_CALL_STATE);
    android.content.IntentFilter intentFilter = new android.content.IntentFilter(android.content.Intent.ACTION_NEW_OUTGOING_CALL);
    ctx.registerReceiver(outgoingReceiver, intentFilter);
}