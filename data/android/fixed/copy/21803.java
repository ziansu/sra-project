public void start() {
    tm = ((android.telephony.TelephonyManager) (ctx.getSystemService(Context.TELEPHONY_SERVICE)));
    tm.listen(callStateListener, PhoneStateListener.LISTEN_CALL_STATE);
}