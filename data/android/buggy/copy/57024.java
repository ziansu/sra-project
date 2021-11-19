public org.openobservatory.measurement_kit.android.IntentRouter emit_intent(java.lang.String event, android.content.Intent intent) {
    lbm.sendBroadcast(intent);
    return this;
}